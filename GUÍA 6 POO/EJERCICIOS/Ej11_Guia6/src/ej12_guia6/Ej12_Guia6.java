/*
 Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la 
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase 
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al 
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date, 
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se 
puede conseguir instanciando un objeto Date con constructor vacío. 
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date()
 */
package ej12_guia6;

import java.util.Date;
import service.FechaService;

public class Ej12_Guia6 {

    public static void main(String[] args) {
        FechaService s = new FechaService();
        Date fecha = s.crearFecha();
        Date fechActual=new Date();
        
        System.out.println("Fecha: "+ fecha);
        System.out.println("Fecha Actual: "+ fechActual);
        System.out.println("");
        System.out.println("Hay "+s.aniosDeDiferencia(fechActual, fecha)+" año/s, "+s.mesesDeDiferencia(fechActual, fecha)+ " mes/es y "+s.diasDeDiferencia(fechActual, fecha)+" días de diferencia.");
    }
    
}
