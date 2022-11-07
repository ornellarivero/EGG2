package com.egg.biblioteca.controladores;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.entidades.Libro;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.service.AutorService;
import com.egg.biblioteca.service.EditorialService;
import com.egg.biblioteca.service.LibroService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/libro")
public class LibroControlador {

    @Autowired
    private LibroService libroService;

    @Autowired
    private AutorService autorService;

    @Autowired
    private EditorialService editService;

    @GetMapping("/registrar")
    public String libroForm(ModelMap modelo) {
        List<Autor> autores = autorService.listarAutores();
        List<Editorial> editoriales = editService.listarEditoriales();

        //Se pasa el valor de las listas a sus respectivos modelos para que se visualicen autores y editoriales en los <option>
        modelo.addAttribute("autores", autores);
        modelo.addAttribute("editoriales", editoriales);

        return "libro_form.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam(required = false) Long isbn, @RequestParam String titulo,
            @RequestParam String editorial, @RequestParam String autor, ModelMap modelo) {
        try {
            libroService.crearLibro(isbn, titulo, editorial, autor);

            modelo.put("exito", "El libro se cargó correctamente");

        } catch (MiException ex) {
            //Se copió y pegó Listas y modelos codeados en el Get para q en el caso de error, sigan almacenados los datos de autores y editoriales en los <select>, 
            List<Autor> autores = autorService.listarAutores();
            List<Editorial> editoriales = editService.listarEditoriales();

            modelo.addAttribute("autores", autores);
            modelo.addAttribute("editoriales", editoriales);

            modelo.put("error", ex.getMessage());
            return "libro_form.html";
        }
        return "index.html";
    }

    @GetMapping("/lista")
    public String listar(ModelMap modelo) {
        List<Libro> libros = libroService.listarLibros();
        
        modelo.addAttribute("libros", libros);
      
        return "libro_list.html";
    }

    @GetMapping("/modificar/{isbn}")
    public String modificar(@PathVariable Long isbn, ModelMap modelo) {

        modelo.put("libro", libroService.getOne(isbn));

        List<Autor> autores = autorService.listarAutores();
        List<Editorial> editoriales = editService.listarEditoriales();

        modelo.addAttribute("autores", autores);
        modelo.addAttribute("editoriales", editoriales);

        return "libro_modificar.html";
    }

    @PostMapping("/modificar/{isbn}")
    public String modificar(@PathVariable Long isbn, String titulo, String autor, String editorial, ModelMap modelo) {
        try {
            List<Autor> autores = autorService.listarAutores();
            List<Editorial> editoriales = editService.listarEditoriales();

            modelo.addAttribute("autores", autores);
            modelo.addAttribute("editoriales", editoriales);

            libroService.modificarLibro(isbn, titulo, autor, editorial);

            return "redirect:../lista";

        } catch (MiException ex) {
            List<Autor> autores = autorService.listarAutores();
            List<Editorial> editoriales = editService.listarEditoriales();

            modelo.put("error", ex.getMessage());

            modelo.addAttribute("autores", autores);
            modelo.addAttribute("editoriales", editoriales);
            
            return "libro_modificar.html";
        }

    }
}
