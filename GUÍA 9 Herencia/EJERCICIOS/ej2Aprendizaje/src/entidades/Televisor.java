package entidades;

public class Televisor extends Electrodomestico{
private float resolucion;
private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(float resolucion, boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(float resolucion, boolean sintonizadorTDT, float precio, String color, String consumoAF, float peso) {
        super(precio, color, consumoAF, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public float getResolucion() {
        return resolucion;
    }

    public void setResolucion(float resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public float precioFinal() {
        super.precioFinal();
        if (resolucion>40) {
            setPrecio(getPrecio()*30/100);
        }
        if (sintonizadorTDT) {
            setPrecio(getPrecio()+500);
        }
        return getPrecio();
    }

    @Override
    public void crearElectr() {
        super.crearElectr();
        System.out.print("-Ingrese Resolución: ");
        setResolucion(leer.nextFloat());
        
        System.out.print("-Tiene Sintonizador?: ");
        setSintonizadorTDT(leer.nextBoolean());
    }
    
    
    
    
}
