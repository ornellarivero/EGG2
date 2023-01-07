/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de 
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del 
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
 */
package ej2_guia6.entidades;

import java.util.Scanner;

public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public static void crearCircunferencia(Circunferencia circ) {
        System.out.print("Ingrese radio: ");
        Scanner leer = new Scanner(System.in);
        circ.setRadio(leer.nextDouble());
    }

    public void area(double radio) {
        double area = 3.14 * (Math.sqrt(radio));
        System.out.println("El área de la circunferencia es: " + area);
    }

    public void perimetro(double radio) {
        double perimetro = 2 * 3.14 * radio;
        System.out.println("El perimetro es: " + perimetro);
    }
}
