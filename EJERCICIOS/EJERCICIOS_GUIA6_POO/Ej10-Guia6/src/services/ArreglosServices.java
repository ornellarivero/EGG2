/*
 Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El 
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. 
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 
20.
 */
package services;

import entidad.Arreglo;
import java.util.Arrays;
import java.util.Scanner;

public class ArreglosServices {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Arreglo crearArreglo(int dimension){
        System.out.print("Dimensión: "+dimension);
        Arreglo a = new Arreglo(dimension);
        return a;
    } 
         
    public void rellenar(Arreglo arr, int dimension){
        for (int i = 0; i < dimension; i++) {
            arr.setVector((float)(Math.random()*10), i);
        }
        System.out.print(Arrays.toString(arr.getVector()));
    }
    
    public void ordenAscendente(Arreglo arr){
        Arrays.sort(arr.getVector());
        System.out.println("Ordenando vector...");
        System.out.println(Arrays.toString(arr.getVector())); 
    }
    
    public void rellenarVectorB(Arreglo a, Arreglo b, int dimension){
        for (int i = 0; i <dimension/2 ; i++) {
            b.setVector(a.getVectori(i), i);
        }
        for (int i = dimension/2; i < dimension; i++) {
            b.setVector((float) 0.5, i);
        }
        System.out.println(Arrays.toString(b.getVector()));
    }
    
  
    
    
}
