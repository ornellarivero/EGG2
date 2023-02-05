package com.eggPractica.noticia.servicios;

import com.eggPractica.noticia.entidad.Usuario;
import com.eggPractica.noticia.enumeraciones.Rol;
import com.eggPractica.noticia.excepciones.MyException;
import com.eggPractica.noticia.repositorios.UsuarioRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.condition.RequestConditionHolder;

@Service
@Transactional
public class UsuarioServicio implements UserDetailsService {
    
    @Autowired
    private UsuarioRepositorio uRepo;
    
    public void registrar(String nombreUsuario, String password, String password2) throws MyException {
        validar(nombreUsuario, password, password2);
        
        Usuario u = new Usuario();
        
        u.setNombreUsuario(nombreUsuario);
        u.setPassword(new BCryptPasswordEncoder().encode(password));
        u.setRol(Rol.USER);
        
        uRepo.save(u);
    }
    
    public void actualizarUser(Long id, String nombreUsuario, String password, String password2) throws MyException {
        validar(nombreUsuario, password, password2);
        
        Optional<Usuario> respuesta = uRepo.findById(id);
        if (respuesta.isPresent()) {
            Usuario u = respuesta.get();
            
            u.setNombreUsuario(nombreUsuario);
            u.setPassword(new BCryptPasswordEncoder().encode(password));
            u.setRol(Rol.USER);
     
            uRepo.save(u);
        }
    }
    
    public void actualizarAdmin(Long id, String nombreUsuario, String password, String password2) throws MyException {
        validar(nombreUsuario, password, password2);
        
        Optional<Usuario> respuesta = uRepo.findById(id);
        if (respuesta.isPresent()) {
            Usuario u = respuesta.get();
            
            u.setNombreUsuario(nombreUsuario);
            u.setPassword(new BCryptPasswordEncoder().encode(password));
            u.setRol(Rol.ADMIN);
      
            uRepo.save(u);
        }
    }
    
    public Usuario getOne(Long id) {
        return uRepo.getOne(id);
    }
    
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = uRepo.findAll();
        return usuarios;
    }
    
    public void cambiarRol(Long id) {
        Optional<Usuario> respuesta = uRepo.findById(id);
        
        if (respuesta.isPresent()) {
            Usuario u = respuesta.get();
            
            if (u.getRol().equals(Rol.USER)) {
                u.setRol(Rol.ADMIN);
            } else if (u.getRol().equals(Rol.ADMIN)) {
                u.setRol(Rol.USER);
            }
        }
    }
    
    public void validar(String nombreUsuario, String password, String password2) throws MyException {
        if (nombreUsuario.isEmpty() || nombreUsuario == null) {
            throw new MyException("El nombre no puede ser nulo");
        }
        
        if (password.isEmpty() || password == null || password.length() < 6) {
            throw new MyException("La contraseña no puede ser nula y debe tener al menos 6 caracteres.");
        }
        
        if (!password.equals(password2)) {
            throw new MyException("Las contraseñas ingresadas no son iguales.");
        }
    }
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario u = uRepo.buscarPorNombre(username);
        
        if (u != null) {
            List<GrantedAuthority>permisos = new ArrayList<>();
            
            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_"+u.getRol().toString());
            permisos.add(p);
            
            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
            
            HttpSession session = attr.getRequest().getSession(true);
            
            session.setAttribute("usuariosession", u);
            
            return new User(u.getNombreUsuario(), u.getPassword(), permisos);
        }else{
            return null;
        }
    }
    
}
