package services;

import entidades.BarcosMotor;

public class BarcoMotorService {

    public BarcosMotor crearVelero() {
        BarcosMotor bm = new BarcosMotor();
        bm.crearBarco();
        float costoAlquiler = AlquilerService.crearAlquiler(bm) + bm.getPotenciaCV();
        System.out.println("\n-Alquiler para barcos a motor: $" + costoAlquiler);
        return bm;
    }
}
