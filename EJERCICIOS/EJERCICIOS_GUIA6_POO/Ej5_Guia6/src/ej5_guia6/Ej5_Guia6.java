package ej5_guia6;

import ej5_guia6.entidad.Cuenta;
import ej5_guia6.service.CuentaService;
import java.util.Scanner;

public class Ej5_Guia6 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        CuentaService service = new CuentaService();
        Cuenta cuenta = service.crearCuenta();
        
        service.ingresar(cuenta);
        service.retirar(cuenta);
        service.extraccionRapida(cuenta);
        service.consultarSaldo(cuenta);
        service.consultarDatos(cuenta);
        
    }
    
}
