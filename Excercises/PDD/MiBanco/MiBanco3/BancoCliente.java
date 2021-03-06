package Excercises.PDD.MiBanco.MiBanco3;

import java.util.Scanner;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class BancoCliente {
    private int current;
    private Scanner scanner;
    private int done;
    private Banco banco;

    public BancoCliente(Scanner scanner, Banco banco) {
        this.banco = banco;
        this.scanner = scanner;
    }

    public void run() {
        do {
            System.out.println("\n0 = Salir del programa\n1 = Crear cuenta\n2 = Seleccionar cuenta"
                    + "\n3 = Deposito a cuenta\n4 = Verificar solicitud de prestamo\n5 = Mostrar balance de cuentas"
                    + "\n6 = Agregar interes\nINGRESA UNA OPCIÓN DEL MENÚ: ");
            done = scanner.nextInt();
            procesarComando(done);
        } while (done < 8);
    }

    private void procesarComando(int cnum) {
        switch (cnum) {
            case 0:
                salir();
                break;
            case 1:
                nuevaCuenta();
                break;
            case 2:
                seleccionar();
                break;
            case 3:
                depositar();
                break;
            case 4:
                autorizarPrestamo();
                break;
            case 5:
                mostrar();
                break;
            case 6:
                agregarInteres();
                break;
            default:
                System.out.println("\nComando ilegal!");
        }
    }

    private void salir() {
        System.out.println("\nGracias por su preferencia, hasta luego!");
        System.exit(0);
    }

    private void nuevaCuenta() {
        banco.nuevaCuenta();
    }

    private void seleccionar() {
        System.out.print("Ingresa el numero de cuenta: ");
        this.current = scanner.nextInt();
        double balance = banco.getBalance(this.current);
        System.out.println("\nEl balance de la cuenta " + this.current + " es " + balance);
    }

    private void depositar() {
        System.out.print("Ingresa la cantidad a depositar: ");
        int monto = scanner.nextInt();
        banco.depositar(this.current, monto);
    }

    private void autorizarPrestamo() {
        System.out.print("Ingresa la cantidad a prestar: ");
        int montoPrestamo = scanner.nextInt();
        if (banco.autorizarPrestamo(this.current, montoPrestamo)) {
            System.out.println("Tu prestamo ha sido aprobado.");
        } else {
            System.out.println("Tu prestamo ha sido denegado.");
        }
    }

    private void mostrar() {
        System.out.println(banco.toString());
    }

    private void agregarInteres() {
        banco.agregarInteres();
    }
}