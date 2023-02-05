/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El 
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. 
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 
20.
*/
package ej10.guia6;

import entidad.Arreglo;
import java.util.Scanner;
import services.ArreglosServices;

public class Ej10Guia6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ArreglosServices s = new ArreglosServices();
        //VECTOR A
        System.out.print("Dimensión VECTOR A: ");
        int dimensionA=leer.nextInt();
        Arreglo a=s.crearArreglo(dimensionA);
        s.rellenar(a, dimensionA);
        System.out.println("");
        
        //VECTOR B
        System.out.print("Dimensión VECTOR B: ");
        int dimensionB=leer.nextInt();
        Arreglo b=s.crearArreglo(dimensionB);
        s.rellenar(b, dimensionB);
        //ORDENAR VECTOR A
         s.ordenAscendente(a);
         //RELLENAR VECTOR B
         s.rellenarVectorB(a, b, dimensionB);
        
        
        
    }
    
}
