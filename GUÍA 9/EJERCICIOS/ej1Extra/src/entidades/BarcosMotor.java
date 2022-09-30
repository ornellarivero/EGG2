package entidades;

import java.util.Calendar;

public class BarcosMotor extends Barco {
    
    protected float potenciaCV;
    
    public BarcosMotor() {
    }
    
    public BarcosMotor(float potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
    public BarcosMotor(float potenciaCV, int matricula, float eslora, Calendar anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }
    
    public float getPotenciaCV() {
        return potenciaCV;
    }
    
    public void setPotenciaCV(float potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
    @Override
    public void crearBarco() {
        System.out.println("\n'BARCO A MOTOR'");
        super.crearBarco();
        System.out.print("-Potencia en CV: ");
        setPotenciaCV(leer.nextFloat());
        
    }
    
}

