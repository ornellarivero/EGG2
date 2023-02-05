package com.egg.biblioteca.controladores;

import com.egg.biblioteca.entidades.Usuario;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.service.UsuarioServicio;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/admin")
public class AdminControlador {

    @Autowired
    private UsuarioServicio uServicio;

    @GetMapping("/dashboard")
    public String panelAdministrativo() {
        return "panelAdministrador.html";
    }

    @GetMapping("/usuarios")
    public String listar(ModelMap modelo) {
        List<Usuario> usuarios = uServicio.listarUsuarios();

        modelo.put("usuarios", usuarios);

        return "usuario_list.html";
    }

    @GetMapping("/modificarRol/{id}")
    public String cambiarRol(@PathVariable Long id) {
        uServicio.cambiarRol(id);
        
        return "redirect:/admin/usuarios";
    }
    
    @PreAuthorize("hasAnyRole('ROLE_USER','ROLE_ADMIN')")
    @GetMapping("/perfilAdmin")
    public String perfilAdmin(ModelMap modelo, HttpSession session){
        Usuario usuario = (Usuario) session.getAttribute("usuariosession");
        modelo.put("usuario", usuario);
        
        return "adminModificar.html";
    }
    
    @PreAuthorize("hasAnyRole('ROLE_USER','ROLE_ADMIN')")
    @PostMapping("/perfilAdmin/{id}")
    public String actualizar(MultipartFile archivo, @PathVariable Long id, @RequestParam String nombre, @RequestParam String mail,@RequestParam String password, @RequestParam String password2, ModelMap modelo){
        try {
            uServicio.actualizar(archivo, id, nombre, mail, password, password2);
            
            modelo.put("exito", "Usuario actualizado correctamente!");
            
            return "panelAdministrador.html";
            
        } catch (MiException e) {
            modelo.put("error", e.getMessage());
            
            return "panelAdministrador.html";
        }
    }
}
