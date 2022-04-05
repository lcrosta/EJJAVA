package ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de euros a convertir:");
        int cant = leer.nextInt();
        
        Scanner mo = new Scanner(System.in);
        
        System.out.println("Ingrese a la moneda que desea convertir: libra, yen o $");
        String moneda = leer.next();
        
        conversion(cant, moneda);
        
    }
    
    public static void conversion (int cant, String moneda){
        
        switch (moneda) {
            case "libra":
                System.out.println("La conversión en libras es de: " + (0.86 * cant));
                break;
            case "yen":
                System.out.println("La conversión en yenes es de: " + (129.852 * cant));
                break;
            case "$":
                System.out.println("La conversión en $ es de: " + (1.28611 * cant));
                break;
        }
        
        return;
        
    }
    
    
    
}
