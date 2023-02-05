package ej5.guia7;

import java.util.HashSet;

public class ListaPaises {

    private HashSet<String> paises = new HashSet<>();
    private String pais;

    public ListaPaises() {
    }

    public ListaPaises(String pais) {
        this.pais = pais;
    }

    public HashSet<String> getPaises() {
        return paises;
    }

    public void setPaises(HashSet<String> paises) {
        this.paises = paises;
    }

    public void setPais(String pais) {
        paises.add(pais);
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return ">" + paises + ">";
    }

}
