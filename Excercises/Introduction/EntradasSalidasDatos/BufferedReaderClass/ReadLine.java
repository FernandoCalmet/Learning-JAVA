package Excercises.Introduction.EntradasSalidasDatos.BufferedReaderClass;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadLine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = br.readLine();

        System.out.println("Hi " + name + ", welcome!");
    }
}
