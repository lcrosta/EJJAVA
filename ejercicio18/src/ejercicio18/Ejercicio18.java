package ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        int contador = 1;
        
        System.out.println("Ingrese 4 números entre el 1 y el 20");
        
        
        do {
            
            num = leer.nextInt();
            
            
            
            for (int i = 0; i < 1; i++) {
                System.out.print(num);
                for (int j = 0; j < num; j++) {
                    System.out.print("*");
                }
            }
            
            System.out.println("");
            contador=contador+1;
            
        } while (contador<5);
        
                
        
        
        
    }
    
}
