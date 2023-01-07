
package ej0.guia8.entidad;

public class Dni {
    private int num;

    public Dni() {
    }

    public Dni(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "DNI: "+num;
    }
}
