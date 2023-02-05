package com.eggPractica.noticia.servicios;

import com.eggPractica.noticia.entidad.Noticia;
import com.eggPractica.noticia.entidad.Periodista;
import com.eggPractica.noticia.entidad.Usuario;
import com.eggPractica.noticia.enumeraciones.Rol;
import com.eggPractica.noticia.excepciones.MyException;
import com.eggPractica.noticia.repositorios.PeriodistaRepositorio;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Service
@Transactional
public class PeriodistaServicio {

    @Autowired
    private PeriodistaRepositorio periodRepo;

    public void crearPeriodista(String nombreUsuario, String password, String password2) throws MyException{
        validar(nombreUsuario, password, password2);

        Periodista p = new Periodista();

        p.setNombreUsuario(nombreUsuario);
        p.setPassword(new BCryptPasswordEncoder().encode(password));
        p.setRol(Rol.PERIODISTA);

        periodRepo.save(p);
    }

    public void modificarPeriodista(Long id, String nombreUsuario, String password, String password2) throws MyException {
        validar(nombreUsuario, password, password2);

        Optional<Periodista> respuesta = periodRepo.findById(id);

        if (respuesta.isPresent()) {
            Periodista p = new Periodista();

            p.setNombreUsuario(nombreUsuario);
            p.setPassword(new BCryptPasswordEncoder().encode(password));
            p.setRol(Rol.PERIODISTA);

            periodRepo.save(p);
        }
    }
    
    public void ingresarSueldo(Long id, Integer sueldo){
        Optional<Periodista>respuesta=periodRepo.findById(id);
        if (respuesta.isPresent()) {
            Periodista p = respuesta.get();
            
            p.setSueldoMensual(sueldo);
        }
    }
    
    public Periodista getOne(Long id) {
        return periodRepo.getOne(id);
    }
    
    public List<Periodista> listarPeriodistas() {
        List<Periodista> periodistas = periodRepo.findAll();
        return periodistas;
    }
    
    public void eliminar(Long id){
        periodRepo.deleteById(id);
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
}
