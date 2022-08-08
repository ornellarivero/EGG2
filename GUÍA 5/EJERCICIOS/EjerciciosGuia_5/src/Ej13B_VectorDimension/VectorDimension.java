/*Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y 
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante. */
package Ej13B_VectorDimension;

import java.util.Scanner;

public class VectorDimension {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("cantidad de compañeros: ");
        int dimension = leer.nextInt();
        String[] equipo = new String[dimension];
        for (int i = 0; i < dimension; i++) {
            System.out.print((i+1) + "° nombre: ");
            String nombre=leer.next();
            equipo[i]=nombre;
        }
        for (int i = 0; i < dimension; i++) {
            System.out.print(equipo[i]+" - ");         
        }
    }

}
