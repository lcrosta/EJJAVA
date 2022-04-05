package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero");
        int num = leer.nextInt();
        
        System.out.println("El doble del número ingresado es " + num*2);
        System.out.println("El triple del número ingresado es " + num*3);
        System.out.println("La raíz cuadrada del número ingresado es " + Math.sqrt(num));
        
    }
    
}
