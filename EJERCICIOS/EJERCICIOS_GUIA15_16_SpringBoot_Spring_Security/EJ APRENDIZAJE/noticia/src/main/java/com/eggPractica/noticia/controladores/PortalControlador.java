package com.eggPractica.noticia.controladores;

import com.eggPractica.noticia.entidad.Usuario;
import com.eggPractica.noticia.excepciones.MyException;
import com.eggPractica.noticia.servicios.UsuarioServicio;
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
@RequestMapping("/")
public class PortalControlador {

    @Autowired
    private UsuarioServicio uServicio;
    
    @GetMapping("/")
    public String inicio(){
        return "inicio.html"; //HACER HTML
    }
    
    @GetMapping("/registrar")
    public String resgistrar(){
        return "registro.html"; //HACER HTML
    }
    
    @PostMapping("/registro")
    public String registro(@RequestParam String nombreUsuario,@RequestParam String password, @RequestParam String password2, ModelMap modelo){
        try {
            uServicio.registrar(nombreUsuario, password, password2);
            modelo.put("exito", "Se creó el usuario!.");
            return "index.html"; //HACER HTML
        } catch (MyException e) {
            modelo.put("error", e.getMessage());
            return "registro.html";
        }
    }
    
    @GetMapping("/login")
    public String login(@RequestParam(required = false)String error, ModelMap modelo){
        if (error != null) {
            modelo.put("error", "Usuario o contraseña inválidos.");
        }
        return "login.html";
    }
    
    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    @GetMapping("/index")
    public String index(HttpSession session){
        Usuario logueado = (Usuario) session.getAttribute("usuariosession");
        
        if (logueado.getRol().toString().equals("ADMIN")) {
            return "redirect:/admin/dashboard";
        }
        return "index.html";
    }
    
    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    @GetMapping("/perfil")
    public String perfil(ModelMap modelo, HttpSession session){
        Usuario usuario = (Usuario) session.getAttribute("usuariosession");
        
        modelo.put("usuario", usuario);
        
        return "usuarioModificar.html"; //HACER HTML
    }
    
    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    @PostMapping("/perfilAdmin/{id}")
    public String actualizarAdmin(@PathVariable Long id, @RequestParam String nombreUsuario,@RequestParam String password, @RequestParam String password2, ModelMap modelo){
        try {
            uServicio.actualizarAdmin(id, nombreUsuario, password, password2);
            modelo.put("exito", "El usuario se actualizó correctamente");
            
            return "redirect:..index";
        } catch (Exception e) {
            modelo.put("error", e.getMessage());
            
            return "usuarioModificar.html";
        }
    }
}
