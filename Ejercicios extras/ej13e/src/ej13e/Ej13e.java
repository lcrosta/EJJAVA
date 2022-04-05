package ej13e;

import java.util.Scanner;

public class Ej13e {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la altura de la escalera");
        int alt = leer.nextInt();
        
        for (int num = 1; num <= alt; num++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(j);
            }
            System.out.println("");
            
        }
     
    }
    
}
