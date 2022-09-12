package interfaces;

import entidades.Perro;

public interface PerroInterface {
    public abstract Perro crearPerro();
    public abstract void juega();
    public abstract boolean ladra();
}
