package Excercises.POO.CuentaBancaria.ejercicio2.accesoDatos;

import java.util.ArrayList;
import Excercises.POO.CuentaBancaria.ejercicio2.entidades.Cuenta;

public class BaseDatosCuenta {
    private ArrayList<Cuenta> cuentas;

    public BaseDatosCuenta() {
        cuentas = new ArrayList<Cuenta>();
    }

    public long agregarCuenta(Cuenta oC) {
        cuentas.add(oC);
        return oC.getNro();
    }

    public Cuenta buscarCuentaxNro(long nro) {
        Cuenta oCta = null;

        for (Cuenta c : cuentas) {
            if (nro == c.getNro()) {
                oCta = c;
            }
        }

        return oCta;
    }

    public void eliminarCuenta(Cuenta oC) {
        cuentas.remove(oC);
    }

    public int obtenerNCuentas() {
        return cuentas.size();
    }

    public String listarCuentas() {
        String cad = "";

        for (Cuenta c : cuentas) {
            cad = cad + c.toString() + "\n";
        }

        return cad;
    }
}