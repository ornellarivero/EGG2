/*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: 
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las 
operaciones asociadas a dicha clase son: 
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes 
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.

d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar 
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la 
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el 
saldo actual en 0. 
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el 
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. 
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/
package ej5_guia6.service;

import ej5_guia6.entidad.Cuenta;
import java.util.Scanner;

public class CuentaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta crearCuenta() {
        Cuenta cuenta = new Cuenta();
        System.out.print("DNI: ");
        cuenta.setDni(leer.nextLong());
        System.out.print("Numero Cuenta: ");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.print("Saldo Actual: ");
        cuenta.setSaldoActual(leer.nextInt());
        return cuenta;
    }

    public void ingresar(Cuenta cuenta) {
        System.out.print("Monto a ingresar: ");
        float saldo = cuenta.getSaldoActual() + leer.nextInt();
        cuenta.setSaldoActual(saldo);
    }

    public void retirar(Cuenta cuenta) {
        System.out.print("Monto a retirar: ");
        double retirar = leer.nextDouble();
        if (retirar > cuenta.getSaldoActual()) {
            System.out.println("Monto a retirar supera saldo.");
            System.out.println("Se retirarán $" + cuenta.getSaldoActual());
            cuenta.setSaldoActual(0);
        } else {
            double saldo = cuenta.getSaldoActual() - retirar;
            System.out.println("Retiró $" + retirar);
            System.out.println("Su saldo es de $" + saldo);
        }

    }

    public void extraccionRapida(Cuenta cuenta) {
        System.out.print("Extracción: $");
        float extraccion = leer.nextFloat();
        float extrPermitida = cuenta.getSaldoActual() / 100 * 20;

        if (extraccion > extrPermitida) {
            while (extraccion > extrPermitida) {
                System.out.println("Supera extracción permitida...");
                System.out.println("Máximo permitido $" + extrPermitida);
                float saldo = cuenta.getSaldoActual() - extrPermitida;
                cuenta.setSaldoActual(saldo);
                break;
            }
        } else {
            float saldo = cuenta.getSaldoActual() - extraccion;
            System.out.println("Su saldo es ---->" + saldo);
            cuenta.setSaldoActual(saldo);
        }
    }

    public void consultarSaldo(Cuenta cuenta) {
        System.out.println("Su saldo es de $" + cuenta.getSaldoActual());
    }

    public void consultarDatos(Cuenta cuenta) {
        System.out.println(cuenta.toString());
    }
}
