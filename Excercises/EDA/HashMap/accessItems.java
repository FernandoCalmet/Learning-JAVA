package Excercises.EDA.HashMap;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.util.HashMap;

class accessItems {
    public static void main(String[] args) {
        HashMap<String, String> alumnos = new HashMap<String, String>();
        alumnos.put("000-123", "Fernando");
        alumnos.put("000-819", "Andres");
        alumnos.put("000-754", "Juan");
        alumnos.put("000-439", "Alessa");

        System.out.println(alumnos.get("000-123"));
    }
}