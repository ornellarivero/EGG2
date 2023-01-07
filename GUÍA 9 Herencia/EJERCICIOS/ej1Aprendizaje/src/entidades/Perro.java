package entidades;

public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
    }

    @Override
    public String toString() {
        return "\nFICHA PERRO\n°°°°°°°°°°°" + "\n-Nombre: " + getNombre() + "\n-Alimento: " + getAlimento() + "\n-Raza: " + getRaza() + "\n-Edad: " + getEdad()+" año/s";
    }

}
