package entidades;

import java.util.Calendar;
import java.util.Scanner;

public class Alquiler {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected String nombreCliente;
    protected int DNI;
    protected Calendar fechaAlquiler, fechaDevolucion;
    protected Barco barco;
    protected float precioAlquiler;

    public Alquiler() {
    }

    public Alquiler(String nombreCliente, int DNI, Calendar fechaAlquiler, Calendar fechaDevolucion, Barco barco, float precioAlquiler) {
        this.nombreCliente = nombreCliente;
        this.DNI = DNI;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.barco = barco;
        this.precioAlquiler = precioAlquiler;
    }

    public String getNombre() {
        return nombreCliente;
    }

    public void setNombre(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public Calendar getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Calendar fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Calendar getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Calendar fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public float getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(float precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombreCliente=" + nombreCliente + ", DNI=" + DNI + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", barco=" + barco + '}';
    }

    public float crearAlquiler(Barco b) {
        System.out.print("Nombre cliente: ");
        setNombre(leer.next());
        System.out.print("DNI: ");
        setDNI(leer.nextInt());
        System.out.print("Fecha alquiler: ");
        fechaAlquiler.set(Calendar.DAY_OF_MONTH, leer.nextInt());
        System.out.print("Fecha devolución: ");
        fechaDevolucion.set(Calendar.DAY_OF_MONTH, leer.nextInt());
        System.out.print("Tipo de barco que alquila: ");
        setBarco(b);
        float diasAlquiler = getFechaAlquiler().get(Calendar.DAY_OF_MONTH) - getFechaDevolucion().get(Calendar.DAY_OF_MONTH);
        float valorModulo = b.getEslora() * 10;
        setPrecioAlquiler(diasAlquiler * valorModulo);
        System.out.println("Precio alquiler: $");
        return getPrecioAlquiler();
    }
}
