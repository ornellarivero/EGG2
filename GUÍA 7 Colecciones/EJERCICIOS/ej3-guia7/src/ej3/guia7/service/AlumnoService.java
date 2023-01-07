/*Crear una clase llamada Alumno que mantenga información sobre las notas de distintos 
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer 
con sus 3 notas. 
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide 
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le 
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno: 

Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota 
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro 
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este 
promedio final, devuelto por el método y mostrado en el main*/
package ej3.guia7.service;

import ej3.guia7.entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> alumnos = new ArrayList<>();

    public Alumno crearAlumno() {
        Alumno a = new Alumno();
        int cantNotas = 3;
        System.out.print("\nIngrese Nombre: ");
        a.setNombre(leer.next().toUpperCase());
        for (int i = 0; i < cantNotas; i++) {
            System.out.print("Nota " + (i + 1)+": ");
            a.setNotas(leer.nextInt());
        }
        return a;
    }

    public void agregarAlumno() {
        System.out.println("AGREGAR ALUMNO");
        do {
            alumnos.add(crearAlumno());
            System.out.print("\nDesea agregar otro alumno? Si/No >>> ");
        } while (leer.next().equalsIgnoreCase("si"));
        System.out.println("");
        System.out.println("ALUMNOS EN LISTA...");
        System.out.println(alumnos.toString());
    }

    public void notaFinal() {
        System.out.println("\n...NOTA FINAL...");
        System.out.print("Nombre de Alumno: ");
        String nombre = leer.next().toUpperCase();
        int cantNotas=0;
        int suma = 0;
        for (Alumno alumno : alumnos) {
            if (nombre.equals(alumno.getNombre())) {
                cantNotas=alumno.getNotas().size();
                for (int i = 0; i < alumno.getNotas().size(); i++) {
                    suma=suma+alumno.getNotas().get(i);
                }
            }
        }
        if (suma==0) {
            System.out.println("El Alumno "+ nombre+" no se encontró.");
        }else{
           System.out.println("Promedio de "+nombre+": "+(suma/cantNotas)); 
        }
    }
}


