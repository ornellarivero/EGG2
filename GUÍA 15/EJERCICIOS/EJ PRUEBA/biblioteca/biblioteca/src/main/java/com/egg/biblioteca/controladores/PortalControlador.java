package com.egg.biblioteca.controladores;

import com.egg.biblioteca.entidades.Usuario;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.service.UsuarioServicio;
import java.util.logging.Level;
import java.util.logging.Logger;
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
//Configurar la URL que va a "escuchar" nuestro Controlador
@RequestMapping("/")
public class PortalControlador {
    
    @Autowired
    private UsuarioServicio usuarioServi;
    
    @GetMapping("/")
    public String index2(){
        return "index2.html";
    }
    
    @GetMapping("/registrar")
    public String registrar(){
        return "registro.html";
    }
    
    @PostMapping("/registro")
    public String registro(@RequestParam MultipartFile archivo, @RequestParam String nombre, @RequestParam String mail,@RequestParam String password, @RequestParam String password2, ModelMap modelo){
        try {
            usuarioServi.registrar(archivo, nombre, mail, password, password2);
            modelo.put("exito", "El usuario se registró correctamente.");
            return "index.html";
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            return "registro.html";
        }
    }
    
    @GetMapping("/login")
    public String login(@RequestParam(required = false)String error, ModelMap modelo){
        if (error != null) {
            modelo.put("error", "Usuario o Contraseña inválidos.");
        }
        return "login.html";
    }
    
    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    @GetMapping("/index")
    public String index(HttpSession session){
        
        //DENTRO DE ESTE "USUARIO" TRAEMOS TODOS LOS DATOS/ATRIBUTOS DE LA SESIÓN
        Usuario logueado = (Usuario) session.getAttribute("usuariosession");
        
        //SI ES ADMINISTRADOR VA A RETORNAR A AL PANEL DEL ADMIN. SINO, A INICIO
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
        
        return "usuarioModificar.html";
    }
    
    @PreAuthorize("hasAnyRole('ROLE_USER','ROLE_ADMIN')")
    @PostMapping("/perfil/{id}")
    public String actualizar(MultipartFile archivo, @PathVariable Long id, @RequestParam String nombre, @RequestParam String mail,@RequestParam String password, @RequestParam String password2, ModelMap modelo){
        try {
            usuarioServi.actualizar(archivo, id, nombre, mail, password, password2);
            
            modelo.put("exito", "Usuario actualizado correctamente!");
            
            return "redirect:../index";
            
        } catch (MiException e) {
            modelo.put("error", e.getMessage());
            
            return "usuarioModificar.html";
        }
    }
}
