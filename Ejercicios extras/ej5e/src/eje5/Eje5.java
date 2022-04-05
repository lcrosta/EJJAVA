package eje5;

import java.util.Scanner;

public class Eje5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su clase de socio: A, B o C.");
        String socio = leer.next();
        System.out.println("Ingrese el gasto");
        int precio = leer.nextInt();
        
        switch (socio) {
            case "A":
                System.out.println("Usted debe abonar: " + (precio*0.5));
                break;
            case "B":
                System.out.println("Usted debe abonar: " + (precio*0.35));
                break;
            case "C":
                System.out.println("Usted debe abonar el total del gasto: " + precio);
                break;
        }
        
        System.out.println("Gracias por utilizar nuestros servicios.");
        
    }
    
}
