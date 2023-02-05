package com.eggPractica.noticia.controladores;

import com.eggPractica.noticia.entidad.Periodista;
import com.eggPractica.noticia.excepciones.MyException;
import com.eggPractica.noticia.servicios.PeriodistaServicio;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/periodista")
public class PeriodistaControlador {
    
    @Autowired
    private PeriodistaServicio periodServicio;
    
    @GetMapping("/registrar")
    public String registrar(){
        return "registroPeriodista.html"; //HACER HTML
    }
    
    @PostMapping("/registro")
    public String registro(@RequestParam String nombreUsuario, @RequestParam String password, @RequestParam String password2, ModelMap modelo) throws MyException{
        try {
            periodServicio.crearPeriodista(nombreUsuario, password, password2);
            modelo.put("exito", "Se creó usuario periodista");
        } catch (MyException e) {
            modelo.put("error", e.getMessage());
            return "registroPeriodista.html";
        }
        return "index.html";
    }
    
    @GetMapping("/lista")
    public String listar(ModelMap modelo){
        List<Periodista>periodistas=periodServicio.listarPeriodistas();
        modelo.addAttribute("periodistas", periodistas);
        
        return "listaPeriodistas.html"; //HACER HTML
    }
    
    @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable Long id, ModelMap modelo){
        modelo.put("periodista", periodServicio.getOne(id));
        return "modificarPeriodista.html"; //HACER HTML
    }
    
    @PostMapping("/modificar/{id}")
    public String modificar(@PathVariable Long id, String nombreUsuario, String password, String password2, ModelMap modelo) throws MyException{
        try {
            periodServicio.modificarPeriodista(id, nombreUsuario, password, password2);
            return "redirect:../lista";
        } catch (MyException e) {
            modelo.put("error", e.getMessage());
            return "modificarPeriodista.html";
        }
    }
    
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id") Long id){
        periodServicio.eliminar(id);
        return "listaPeriodistas.html";
    }
    
    
    
    
    
}
