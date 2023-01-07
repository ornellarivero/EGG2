/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser 
X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta 
de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
incorrectas recibidas.*/
//Substring(), Length(), equals().
package Ej12_DispositivoRS232;

import java.util.Scanner;

public class DispositivoRS232 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena = "qwert";
        int longitud = cadena.length();
        boolean cinco_largo = cadena.length() == 5;
        //boolean empiezaTermina = (cadena.substring(0, 1).equals("x")) & (cadena.substring(longitud - 1, longitud).equals("o"));
        String cinco_y = "&&&&&";
        int correctas = 0;
        int incorrectas = 0;
        int cont=1;
        while ((cinco_largo) & (!cadena.equals(cinco_y))) {
            System.out.println(cont + "° cadena: ");
            cadena = leer.next().toLowerCase();
            if ((cadena.substring(0, 1).equals("x")) & (cadena.substring(longitud - 1, longitud).equals("o"))) {
                correctas = correctas + 1;
            } else{
                incorrectas = incorrectas + 1;
            }
            cont=cont+1;
        }
        System.out.println("Correctas: " + correctas);
        System.out.println("Incorrectas: " + (incorrectas-1));
    }
}
