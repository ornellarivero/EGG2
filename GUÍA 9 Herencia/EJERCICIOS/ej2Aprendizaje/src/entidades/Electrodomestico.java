package entidades;

import java.util.Scanner;
import services.ElectrodomService;

public class Electrodomestico {

    ElectrodomService es = new ElectrodomService();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private float precio = 1000;
    private String color, consumoAF;
    private float peso;

    public Electrodomestico() {
    }

    public Electrodomestico(float precio, String color, String consumoAF, float peso) {
        this.precio = precio;
        this.color = color;
        this.consumoAF = consumoAF;
        this.peso = peso;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoAF() {
        return consumoAF;
    }

    public void setConsumoAF(String consumo) {
        this.consumoAF = consumo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "$" + precio + "\n-Color: "+ color + "\n-Consumo: " + consumoAF + "\n-Peso: " + peso + "kg.";
    }

    public float precioFinal() {
        switch (consumoAF) {
            case "A":
                precio += 1000;
                break;
            case "B":
                precio += 800;
                break;
            case "C":
                precio += 600;
                break;
            case "D":
                precio += 500;
                break;
            case "E":
                precio += 300;
                break;
            case "F":
                precio += 100;
                break;
        }
        if (peso >= 1 && peso <= 19) {
            precio += 100;
        } else if (peso >= 20 && peso <= 49) {
            precio += 500;
        } else if (peso >= 50 && peso <= 80) {
            precio += 800;
        } else if (peso > 80) {
            precio += 1000;
        }
        return precio;
    }

    public void crearElectr() {
        setColor(es.comprobarColor());
        setConsumoAF(es.comprobarConsumoEnergetico());
        System.out.print("-Ingrese peso: ");
        setPeso(leer.nextFloat());
    }
}
