/*Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)*/
package ej2aprendizaje.services;

import ej2aprendizaje.entidades.Revolver;

public class RevolverService {

    public Revolver llenarRevolver() {
        Revolver r = new Revolver();
        r.setPosicionTamborActual((int) (Math.random() * 10 + 1));
        r.setPosicionAgua((int) (Math.random() * 10 + 1));
        //GUARDAR REVOLVER EN UNA VARIABLE
        return r;
    }

    //devuelve true si la posición del agua coincide con la posición actual
    public boolean gatillar(Revolver variable) {
        return (variable.getPosicionAgua() == variable.getPosicionTamborActual());
    }

    //cambia a la siguiente posición del tambor
    public void siguienteChorro(Revolver variable) {
        if (variable.getPosicionTamborActual() == 10) {
            variable.setPosicionTamborActual(1);
        } else {
            variable.setPosicionTamborActual(variable.getPosicionTamborActual() + 1);
        }
    }

    public void verPosicionRevolver(Revolver variable) {
        System.out.println("Ubicación tambor: " + variable.getPosicionTamborActual() + "\nUbicación bala: " + variable.getPosicionAgua());
    }
}
