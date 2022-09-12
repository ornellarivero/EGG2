package interfaces;

import entidades.Perro;

public interface PerroInterface {
    public final int COME=2;
    
    public abstract Perro crearPerro();
    public abstract void juega();
    public abstract boolean ladra();
    public abstract String comeEnElDia();
}
