package services;

import entidades.Loro;
import interfaces.LoroInterface;

public class LoroService implements LoroInterface {

    @Override
    public Loro crearLoro() {
        Loro l = new Loro();
        l.setNombre("Pomelo");
        l.setRaza("Amazonas Aestiva");
        l.setEdad("10 añitos");
        return l;
    }

    @Override
    public void hablar() {
        System.out.println("A Pomelo le encanta hablar con la gente.");
        
    }

    @Override
    public boolean baila() {
        boolean baila=true;
        System.out.println("Poemlo grita?: "+baila);
        return baila;
    }
    
}
