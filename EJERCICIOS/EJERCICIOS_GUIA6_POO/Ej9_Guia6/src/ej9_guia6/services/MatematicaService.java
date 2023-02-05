/*
En el main se creará el objeto y se usará el 
Math.random para generar los dos números y se guardaran en el objeto con su 
respectivos set. Deberá además implementar los siguientes métodos: 
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado 
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ej9_guia6.services;

import ej9_guia6.entidades.Matematica;
import java.util.Scanner;

public class MatematicaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Matematica crear() {
        Matematica mat = new Matematica();
        System.out.print("Ingrese num 1, puede ser decimal: ");
        mat.setNum1((float)(Math.random()*11));
        System.out.print("Ingrese num 2, puede ser decimal: ");
        mat.setNum2((float)(Math.random()*11));
        return mat;
    }

    public void devolverMayor(Matematica mat) {
        System.out.println("Num 1= " + mat.getNum1() + " // " + "Num 2= " + mat.getNum2());
        float mayor = Math.max(mat.getNum1(), mat.getNum2());
        System.out.println("El mayor es: " + mayor);
    }

    public void calcularPotencia(Matematica mat) {
        
        float redondearNum1 = Math.round(mat.getNum1());
        System.out.println("Num 1 redondeado: " + redondearNum1);
        float redondearNum2 = Math.round(mat.getNum2());
        System.out.println("Num 2 redondeado: " + redondearNum2);
        
        float mayor = Math.max(redondearNum2, redondearNum1);
        float menor = Math.min(redondearNum2, redondearNum1);
        double potencia = Math.pow(mayor, menor);
        System.out.println(mayor + " elevado al " + menor + " = " + potencia);
    }

    public void calculaRaiz(Matematica mat) {
        float menor = Float.min(mat.getNum1(), mat.getNum2());
        float abs=Math.abs(menor);
        System.out.println("Valor abs: "+abs);
        double raiz=Math.sqrt(abs);
        System.out.println("Raiz cuadrada de "+menor+" es "+raiz);
    }

}
