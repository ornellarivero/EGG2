package com.eggPractica.noticia.controladores;

import com.eggPractica.noticia.entidad.Usuario;
import com.eggPractica.noticia.excepciones.MyException;
import com.eggPractica.noticia.servicios.UsuarioServicio;
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

@Controller
@RequestMapping("/admin")
public class AdminControlador {
    @Autowired
    private UsuarioServicio uServicio;
    
    @GetMapping("/dashboard")
    public String panelAdministrador(){
        return "panelAdministrador.html"; //HACER HTML
    }
    
    @GetMapping("/usuarios")
    public String listarUsuarios(ModelMap modelo){
        List<Usuario>usuarios = uServicio.listarUsuarios();
        
        modelo.put("usuarios", usuarios);
        
        return "listaUsuarios.html"; //HACER HTML
    }
    
    @GetMapping("/cambiarRol/{id}")
    public String cambiarRol(@PathVariable Long id){
        uServicio.cambiarRol(id);
        
        return "redirect:/admin/usuarios";
    }
    
    @PreAuthorize("hasAnyRol('ROLE_USER', 'ROLE_ADMIN')")
    @GetMapping("/perfilAdmin")
    public String perfilAdmin(ModelMap modelo, HttpSession session){
        Usuario usuario = (Usuario) session.getAttribute("usuariosession");
        modelo.put("usuario", usuario);
        
        return "modificarAdmin.html"; //HACER HTML
    }
    
    @PreAuthorize("hasAnyRol('ROLE_USER', 'ROLE_ADMIN')")
    @PostMapping("perfilAdmin/{id}")
    public String actualizar(@PathVariable Long id, @RequestParam String nombreUsuario, @RequestParam String password, @RequestParam String password2, ModelMap modelo){
        try {
            uServicio.actualizarAdmin(id, nombreUsuario, password, password2);
            
            modelo.put("exito", "Usuario actualizado");
            
            return "panelAdministrador,html";
        } catch (MyException e) {
            modelo.put("error", e.getMessage());
            
            return "panelAdministrador,html";
        }
    }
    
    
    
    
}
