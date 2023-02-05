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
package service;

import java.util.Date;
import java.util.Scanner;

public class FechaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Date crearFecha() {
        Date fecha = new Date(0, 0, 0);

        System.out.print("Año: ");
        fecha.setYear(leer.nextInt() - 1900);

        System.out.print("Mes: ");
        fecha.setMonth(leer.nextInt()-1);

        System.out.print("Día: ");
        fecha.setDate(leer.nextInt());

        return fecha;
    }
    
    public int aniosDeDiferencia(Date fechaActual, Date fecha){
        return fechaActual.getYear()-fecha.getYear();
    }
    
    public int mesesDeDiferencia(Date fechaActual, Date fecha){
        return fechaActual.getMonth()-fecha.getMonth();
    }
    public int diasDeDiferencia(Date fechActual, Date fecha){
            return fechActual.getDate()-fecha.getDate();
        }
    
    
}
