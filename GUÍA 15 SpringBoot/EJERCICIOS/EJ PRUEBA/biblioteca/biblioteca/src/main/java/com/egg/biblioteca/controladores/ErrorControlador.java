package com.egg.biblioteca.controladores;

import javax.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
// "ErrorController" ES UNA CLASE/INTERFACE DE SPRING
public class ErrorControlador implements ErrorController{
    
    //TODO RECURSO QUE VENGA CON "/error" ENTRARÁ A ÉSTE MÉTODO, YA SEA "GET", "POST"
    @RequestMapping(value = "/error", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView renderErrorPage(HttpServletRequest httpRequest){
        
        //SE RECUPERA EL CÓDIGO DE ERROR Q VIENE DEL SERVIDOR
        ModelAndView errorPage = new ModelAndView("error");
        
        String errorMsg="";
        
        int httpErrorCode = getErrorCode(httpRequest);
        
        switch (httpErrorCode) {
            case 400:{
                errorMsg = "El recurso solicitado no existe.";
                break;
            }
            case 403:{
                errorMsg = "No tiene permisos para acceder al recurso.";
                break;
            }
            case 401:{
                errorMsg = "No se encuentra autorizado.";
                break;
            }
            case 404:{
                errorMsg = "El recurso solicitado no fue encontrado.";
                break;
            }
            case 500:{
                errorMsg = "Ocurrió un error interno.";
                break;
            }
        }
        errorPage.addObject("codigo", httpErrorCode);
        errorPage.addObject("mensaje", errorMsg);
        return errorPage;
    }
    
    //MÉTODO QUE RECIBE LA PETICIÓN, TRAE EL ATRIBUTO DEL STATUS DEL CÓDIGO Y LO CASTE A ENTERO
    private int getErrorCode(HttpServletRequest httpRequest){
        return (Integer) httpRequest.getAttribute("javax.servlet.error.status_code");
    }
    
    public String getErrorPath(){
        return "/error.html";
    }
}
