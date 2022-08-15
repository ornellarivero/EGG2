/*Crea una clase en Java donde declares una variable de tipo array de Strings que contenga 
los doce meses del año, en minúsculas. */
package entidad;

public class Array {

    private String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

    public Array() {
    }

    public String[] getMes() {
        return mes;
    }
    
    public void setMes(String[] mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "Array{" + "mes=" + mes + '}';
    }

    
}
