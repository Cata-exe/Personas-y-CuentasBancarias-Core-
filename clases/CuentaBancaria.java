package clases;
import java.util.ArrayList;
import java.util.Random;

public class CuentaBancaria {
    private double saldo;
    private Persona titular;
    private int numeroCuenta;
    private static ArrayList<CuentaBancaria> listaDeCuentaBancarias = new ArrayList<>();

    public CuentaBancaria(double saldo, Persona titular){
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = numeroCuentaRandom();
        listaDeCuentaBancarias.add(this);
    }

    private int numeroCuentaRandom(){
        Random rand = new Random();
        return rand.nextInt(900000) + 100000;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public Persona getTitular(){
        return titular;
    }

    public void setTitular(Persona titular){
        this.titular = titular;
    }

    public int getNumeroCuenta(){
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    public void depositar(double monto){
        this.saldo += monto;
    }

    public void retirar(double monto){
        /*if(monto > saldo){
            System.out.println("no hay saldo suficiente");
        }
        else if(monto == saldo){
            System.out.println("nuevo saldo disponible 0 pesos");
        }
        else{
            saldo-=monto;
        } */
        if(monto < saldo){
            saldo-=monto;
        }
    }
    public void despliegaInformacion(){
        System.out.println("Bienvenido a tu cuenta bancaria " + titular.getNombre() + " " + numeroCuenta +  " , tu saldo disponible es: " + saldo + "pesos.");
    }

    public void imprimirInformacion() {
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular.getNombre());
        System.out.println("Edad: " + titular.getEdad());
        System.out.println("Saldo: " + saldo);
    }

    public static void imprimeInformacionDeTodasLasCuentas(){
    for (CuentaBancaria cuenta : listaDeCuentaBancarias) {
        cuenta.imprimirInformacion();
        }
    }
}
