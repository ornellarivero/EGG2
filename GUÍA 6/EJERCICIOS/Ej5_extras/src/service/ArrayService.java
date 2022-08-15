/*A continuación, declara una variable mesSecreto 
de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El 
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar 
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un 
ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!*/
package service;

import entidad.Array;
import java.util.Scanner;

public class ArrayService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void adivinarMes() {
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        System.out.println("ADIVINE EL MES. Tiene 3 intentos.");
        System.out.print("Mes?: ");
        String mes = leer.next().toLowerCase();
        int meSecreto = (int) (Math.random() * 11);
        int cont = 3;
        while (!meses[meSecreto].equals(mes) & cont > 1) {
            cont = cont - 1;
            System.out.println("No adivinó. Tiene " + cont + " intentos más...");
            System.out.print("Mes?: ");
            mes = leer.next().toLowerCase();
        }
        if (cont!=1) {
            System.out.println("Adivinó, el mes es " + meses[meSecreto].toUpperCase());
        }else{
            System.out.println("No adivinó. El mes era " + meses[meSecreto].toUpperCase());
        }
      }
    
    

}
