import clases.Persona;
import clases.CuentaBancaria;

public class Aplicacion {
    
    public static void main(String [] args){

        Persona Sabrina = new Persona("Sabrina Carpenter", 25);
        Persona Olivia = new Persona("Olivia Rodrigo", 21);
        Persona Justin = new Persona("Justin Bieber", 30);

        CuentaBancaria cuentaDeSabrina = new CuentaBancaria(5000.00000, Sabrina);
        CuentaBancaria cuentaDeOlivia = new CuentaBancaria(3000.0000, Olivia);
        CuentaBancaria cuentaDeJustin = new CuentaBancaria(8000.00000, Justin);

        cuentaDeSabrina.retirar(5000);
        cuentaDeJustin.depositar(80000);
        cuentaDeOlivia.retirar(50000);

        System.out.println("Saldo actual de " + Sabrina.getNombre() + " " + cuentaDeSabrina.getSaldo());
        System.out.println("Saldo actual de " + Olivia.getNombre() + " " + cuentaDeOlivia.getSaldo());
        System.out.println("Saldo actual de " + Justin.getNombre() + " " + cuentaDeJustin.getSaldo());

        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
    }
}
