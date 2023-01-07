package entidades;

public class Lavadora extends Electrodomestico {

    private float carga;

    public Lavadora() {
    }

    public Lavadora(float carga) {
        this.carga = carga;
    }

    public Lavadora(float carga, float precio, String color, String consumoAF, float peso) {
        super(precio, color, consumoAF, peso);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    @Override
    public float precioFinal() {
        super.precioFinal();
        if (carga > 30) {
            setPrecio(getPrecio() + 500);
        }
        return getPrecio();
    }

    @Override
    public void crearElectr() {
        super.crearElectr();
        System.out.print("-Ingrese carga: ");
        setCarga(leer.nextFloat());
    }
    
    
}
