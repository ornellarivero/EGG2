package entidades;

import java.util.Calendar;
import java.util.Scanner;

public class Barco {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected int matricula;
    protected float eslora;
    protected Calendar anioFabricacion;

    public Barco() {
    }

    public Barco(int matricula, float eslora, Calendar anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getEslora() {
        return eslora;
    }

    public void setEslora(float eslora) {
        this.eslora = eslora;
    }

    public Calendar getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Calendar anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion + '}';
    }
    //HACER QUE DEVUELVA UN OBJETO DE TIPO BARCO Y DESPUES SE INSTANCIA COMO UNA SUBCLASE
    public void crearBarco(){
        System.out.print("-Matrícula: ");
        setMatricula(leer.nextInt());
        System.out.print("-Metros eslora: ");
        setEslora(leer.nextFloat());
        System.out.println("-Año fabricación: ");
        anioFabricacion.set(Calendar.YEAR, leer.nextInt());
    }
    
}
