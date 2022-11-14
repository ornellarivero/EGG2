package com.eggPractica.noticia.controladores;

import com.eggPractica.noticia.entidad.Noticia;
import com.eggPractica.noticia.servicios.NoticiaServicio;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/noticia")
public class NoticiaControlador {

    @Autowired
    private NoticiaServicio notiService;

//    NO LO MUESTRA!!!!!
    @GetMapping("/principal")
    public String principal() {

        return "principal.html";
    }

    @GetMapping("/formcrear")
    public String notiForm(ModelMap modelo) {
        List<Noticia> noticias = notiService.listar();

        modelo.put("noticias", noticias);

        return "notiForm.html";
    }

    @PostMapping("/formcrear")
    public String cargaNotiPost(@RequestParam String titulo, @RequestParam String cuerpo, @RequestParam String foto, ModelMap modelo) throws Exception {
        try {
            notiService.crear(titulo, cuerpo, foto);

            modelo.put("exito", "La noticia se cargó");

        } catch (Exception ex) {
            modelo.put("error", ex.getMessage());
            return "notiForm.html";
        }
        return "notiForm.html";
    }

    @GetMapping("/lista")
    public String listarNoticia(ModelMap modelo) {
        List<Noticia> noticias = notiService.listar();

        modelo.addAttribute("noticias", noticias);

        return "noti_list.html";
    }

    @GetMapping("/mostrarNoticia/{id}")
    public String mostrarNoticia(@PathVariable Long id, ModelMap modelo) {
        modelo.put("noticia", notiService.getOne(id));
        return "mostrarNoticia.html";
    }

    @GetMapping("/modificarNoticia/{id}")
    public String modificarNoticia(@PathVariable Long id, ModelMap modelo) {
        modelo.put("noticia", notiService.getOne(id));
        return "modificarNoticia.html";
    }

    @PostMapping("/modificarNoticia/{id}")
    public String modificarNoticia(@PathVariable Long id, String titulo, String cuerpo, String foto, ModelMap modelo) {
        try {
            notiService.modificar(id, titulo, cuerpo, foto);
            modelo.put("exito", "La noticia se modificó correctamente");
            return "redirect:../lista";

        } catch (Exception ex) {
            modelo.put("error", ex.getMessage());
        }
        return "modificarNoticia.html";
    }

    @GetMapping("/eliminarNoticia/{id}")
    public String eliminarNoticia(@PathVariable(value="id")Long id) {
        notiService.eliminar(id);
        return "redirect:../lista";
    }

//    @DeleteMapping("/eliminarNoticia/{id}")
//    public String eliminarNoti(@PathVariable Long id, ModelMap modelo) {
//
//        notiService.eliminar(id);
//        modelo.put("eliminar", "Seguro que desea eliminar esta noticia?");
//
//        return "redirect:../lista";
//    }
}
