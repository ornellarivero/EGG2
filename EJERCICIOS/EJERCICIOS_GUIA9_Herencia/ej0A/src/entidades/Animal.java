package entidades;

//SI ESCRIBO "ABSTRACT" NO PODRÉ INSTANCIAR UN OBJETO DEL TIPO ANIMAL, SÍ UN OBJETO DE SU SUBCLASE (ej: Perro y Gato)

//public abstract class Animal {
public class Animal {

    protected String nombre, color, raza, edad;

    public Animal() {
    }

    public Animal(String nombre, String color, String raza, String edad) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
//SI A ESTE MÉTODO LE ESCRIBO "FINAL" NO PODRÁ SOBREESCRIBISRSE EN LAS SUBCLASES
    
//    public final void hacerRuido() {
    public void hacerRuido() {
        System.out.println("hacen los siguientes ruídos...");
    }

    //*AL CREAR UN MÉTODO ABSTRACTO, PERMITO Q LAS SUBCLASES LE DESARROLLEN CÓDIGO DENTRO
    //*PARA CREAR UN MÉTODO ABSTRACTO, LA CLASE LO DEBE SER
    
    
/*    public abstract void comer();*/
}
