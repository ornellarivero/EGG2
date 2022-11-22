package com.egg.biblioteca.service;

import com.egg.biblioteca.entidades.Imagen;
import com.egg.biblioteca.entidades.Usuario;
import com.egg.biblioteca.enumeraciones.Rol;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.repositorios.UsuarioRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.condition.RequestConditionHolder;

@Service
@Transactional
public class UsuarioServicio implements UserDetailsService {
    
    @Autowired
    private UsuarioRepositorio usuarioRepo;
    
    @Autowired
    private ImagenServicio imgServicio;
    
    public void registrar(MultipartFile archivo, String nombre, String mail, String password, String password2) throws MiException {
        validar(nombre, mail, password, password2);
        
        Usuario u = new Usuario();
        
        u.setNombre(nombre);
        u.setMail(mail);
        u.setPassword(new BCryptPasswordEncoder().encode(password));
        u.setRol(Rol.USER);
        
        Imagen img = imgServicio.guardar(archivo);
        
        u.setImagen(img);
        
        usuarioRepo.save(u);
        
    }
    
    public void actualizar(MultipartFile archivo, Long id, String nombre, String mail, String password, String password2) throws MiException {
        validar(nombre, mail, password, password2);
        
        Optional<Usuario> respuesta = usuarioRepo.findById(id);
        if (respuesta.isPresent()) {
            
            Usuario u = respuesta.get();
            
            u.setNombre(nombre);
            u.setMail(mail);
            u.setPassword(new BCryptPasswordEncoder().encode(password));
            u.setRol(Rol.USER);
            
            Long idImg = null;
            
            if (u.getImagen() != null) {
                idImg = u.getImagen().getId();
            }
            
            Imagen img = imgServicio.actualizar(archivo, idImg);
            
            u.setImagen(img);
            
            usuarioRepo.save(u);
        }
        
    }
    
    public Usuario getOne(Long id) {
        return usuarioRepo.getOne(id);
    }
    
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = usuarioRepo.findAll();
        return usuarios;
    }
    
    public void cambiarRol(Long id) {
        Optional<Usuario> respuesta = usuarioRepo.findById(id);
        
        if (respuesta.isPresent()) {
            Usuario u = respuesta.get();
            
            if (u.getRol().equals(Rol.USER)) {
                u.setRol(Rol.ADMIN);
                
            } else if (u.getRol().equals(Rol.ADMIN)) {
                u.setRol(Rol.USER);
            }
        }
    }
    
    private void validar(String nombre, String mail, String password, String password2) throws MiException {
        if (nombre.isEmpty() || nombre == null) {
            throw new MiException("El nombre no puede ser nulo.");
        }
        
        if (mail.isEmpty() || mail == null) {
            throw new MiException("El mail no puede ser nulo.");
        }
        
        if (password.isEmpty() || password == null || password.length() <= 5) {
            throw new MiException("La contraseña no puede estar vacía y debe tener al menos 6 caracteres.");
        }
        
        if (!password.equals(password2)) {
            throw new MiException("Las contraseñas ingresadas no son iguales.");
        }
    }
    
    @Override
    //AUTENTICAR USUARIO
    public UserDetails loadUserByUsername(String mail) throws UsernameNotFoundException {
        Usuario u = usuarioRepo.buscarPorEmail(mail);
        
        if (u != null) {
            //CREAMOS LA LISTA CON LOS PERMISOS PARA PASARLE AL CONSTRUCTOR DE "USER"
            List<GrantedAuthority> permisos = new ArrayList<>();

            //SE CREAN PERMISOS PARA UN USUARIO
            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_" + u.getRol().toString()); //-->ROLE_USER
            permisos.add(p);

            //RECUPERA LOS ATRIBUTOS DEL REQUEST (LA SOLICITUD HTTP)
            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();

            //SE GUARDA EL LLAMADO HTTP Y LA SESIÓN 
            HttpSession session = attr.getRequest().getSession(true);

            //SE SETEAN LOS ATRIBUTOS DEL USUARIO BUSCADO EN BD (linea 65)
            session.setAttribute("usuariosession", u);

            //TRANSFORMAMOS USUARIO DEL DOMINIO "SPRING"
            return new User(u.getMail(), u.getPassword(), permisos);
        } else {
            return null;
        }
    }
}
