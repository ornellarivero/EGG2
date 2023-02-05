package interfaces;

import entidades.Loro;

public interface LoroInterface {
    
    public final int CANTSEMILLAS=10;
    
    public abstract Loro crearLoro();
    public abstract void hablar();
    public  abstract boolean baila();
    public void cantiSemillas();
}
