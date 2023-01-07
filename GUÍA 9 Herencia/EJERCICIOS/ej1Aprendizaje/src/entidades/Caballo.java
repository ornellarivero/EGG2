package entidades;

public class Caballo extends Animal {

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
    }

    @Override
    public String toString() {
        return "\nFICHA CABALLO\n°°°°°°°°°°°°°" + "\n-Nombre: " + getNombre() + "\n-Alimento: " + getAlimento() + "\n-Raza: " + getRaza() + "\n-Edad: " + getEdad() + " año/s";
    }
}
