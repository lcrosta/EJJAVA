package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un límite positivo");
        int limite = leer.nextInt();
        int suma = 0;
        
        while (suma<=limite){
            System.out.println("Ingrese un número");
            int num = leer.nextInt();
            suma=suma+num;
        }   
        
        System.out.println("La suma es de " + suma);
                
        
    }
    
}
