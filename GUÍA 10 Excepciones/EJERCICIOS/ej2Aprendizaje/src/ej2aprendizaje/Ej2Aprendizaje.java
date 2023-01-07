/*Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para 
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera 
de rango)*/
package ej2aprendizaje;

public class Ej2Aprendizaje {

    public static void main(String[] args) {
        int[] vector = new int[2];
        try {
            vector[0]=3;
            vector[1]=4;
            vector[3]=2;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fallo vector: "+e);
        }
        System.out.println("\nSigue la ejecución del código...");
    }

}
