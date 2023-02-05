package entidades;

public abstract class Forma {
private float area, perimetro, base, altura, diametro, radio;

    public Forma() {
    }

    public Forma(float area, float perimetro, float base, float altura, float diametro, float radio) {
        this.area = area;
        this.perimetro = perimetro;
        this.base = base;
        this.altura = altura;
        this.diametro = diametro;
        this.radio = radio;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "\nFORMA\n" + "\n-area= " + getArea() + "\n-perimetro= " + getPerimetro();
    }

    
    
    

}
