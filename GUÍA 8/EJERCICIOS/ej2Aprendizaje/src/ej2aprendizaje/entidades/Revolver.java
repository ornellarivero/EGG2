/*Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición 
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del 
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.*/
package ej2aprendizaje.entidades;

public class Revolver {
    private int posicionTamborActual, posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicionTamborActual, int posicionAgua) {
        this.posicionTamborActual = posicionTamborActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionTamborActual() {
        return posicionTamborActual;
    }

    public void setPosicionTamborActual(int posicionTamborActual) {
        this.posicionTamborActual = posicionTamborActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver: " + "Posicion Tambor: " + posicionTamborActual + ", Posición Agua: " + posicionAgua;
    }
}
