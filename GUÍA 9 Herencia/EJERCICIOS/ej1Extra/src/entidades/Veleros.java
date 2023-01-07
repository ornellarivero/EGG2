package entidades;

import java.util.Calendar;

public class Veleros extends Barco{
    protected int numMastiles;

    public Veleros() {
    }

    public Veleros(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    public Veleros(int numMastiles, int matricula, float eslora, Calendar anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    @Override
    public void crearBarco() {
        System.out.println("\n'VELERO'");
        super.crearBarco();
        System.out.print("-Núm. mástiles: ");
        setNumMastiles(leer.nextInt());
    }

    
}
