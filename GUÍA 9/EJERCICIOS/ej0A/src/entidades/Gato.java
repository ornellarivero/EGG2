package entidades;

public class Gato extends Animal {

    private boolean maullar;

    public Gato() {
    }

    public Gato(boolean maullar) {
        this.maullar = maullar;
    }

    public Gato(boolean maullar, String nombre, String color, String raza, String edad) {
        super(nombre, color, raza, edad);
        this.maullar = maullar;
    }

    public boolean isMaullar() {
        return maullar;
    }

    public void setMaullar(boolean maullar) {
        this.maullar = maullar;
    }

    @Override
    public void hacerRuido() {
        maullar = true;
        System.out.println(" Maulla?: " + maullar);

    }
}
