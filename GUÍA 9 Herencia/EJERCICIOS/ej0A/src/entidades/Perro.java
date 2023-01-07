package entidades;

public class Perro extends Animal {

    private boolean ladrar;

    public Perro() {
    }

    public Perro(boolean ladrar) {
        this.ladrar = ladrar;
    }

    public Perro(boolean ladrar, String nombre, String color, String raza, String edad) {
        super(nombre, color, raza, edad);
        this.ladrar = ladrar;
    }

    public boolean isLadrar() {
        return ladrar;
    }

    public void setLadrar(boolean ladrar) {
        this.ladrar = ladrar;
    }

    @Override
    public void hacerRuido() {
        ladrar = true;
        System.out.println(" Ladra?: " + ladrar);
    }
}
