package eje1;

import java.util.Scanner;

public class Eje1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad en minutos para realizar la conversión");
        int min = leer.nextInt();
        
        System.out.println("El tiempo en horas es de: " + (min/60));
        System.out.println("El tiempo en dias es de: " + (min/1440));
        
        
    }
    
}
