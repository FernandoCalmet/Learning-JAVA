package Switch;

import java.util.Scanner;

public class Ejemplo01 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresar un numero entre 0,1,2,3: ");
        int menu = Integer.parseInt(scanner.nextLine());
        
        switch(menu){
            case 0:
                System.out.println("Usted escogio la opcion 0");
                break;
            case 1:
                System.out.println("Usted escogio la opcion 1");
                break;
            case 2:
                System.out.println("Usted escogio la opcion 2");
                break;
            case 3:
                System.out.println("Usted escogio la opcion 3");
                break;
        }
        
        System.out.println("Gracias por usar nuestro menu.");
        
    }
        
}
