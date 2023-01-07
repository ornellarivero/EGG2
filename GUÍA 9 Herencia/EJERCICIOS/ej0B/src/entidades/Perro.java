package entidades;

public class Perro {
private String nombre, raza, edad;

    public Perro(String nombre, String raza, String edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public Perro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\nPERRO\n°°°°°" + "\n-Nombre: " + nombre + "\n-Raza: " + raza + "\n-Edad: " + edad;
    }
    

}
