package entidades;

import java.util.Calendar;

public class Yates extends Barco{
    protected float potenciaCV;
    protected int cantCamarotes;

    public Yates() {
    }

    public Yates(float potenciaCV, int cantCamarotes) {
        this.potenciaCV = potenciaCV;
        this.cantCamarotes = cantCamarotes;
    }

    public Yates(float potenciaCV, int cantCamarotes, int matricula, float eslora, Calendar anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.cantCamarotes = cantCamarotes;
    }

    public float getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(float potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(int cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    public void crearBarco() {
        System.out.println("\n'YATE'");
        super.crearBarco();
        System.out.print("-Potencia en CV: ");
        setPotenciaCV(leer.nextFloat());
        System.out.print("-Cantidad de camarotes: ");
        setCantCamarotes(leer.nextInt());
    }

    
}
