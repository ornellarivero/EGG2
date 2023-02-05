package entidades;

public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
    }

    @Override
    public String toString() {
        return "\nFICHA GATO\n°°°°°°°°°°°" + "\n-Nombre: " + getNombre() + "\n-Alimento: " + getAlimento() + "\n-Raza: " + getRaza() + "\n-Edad: " + getEdad() + " año/s";
    }

}
