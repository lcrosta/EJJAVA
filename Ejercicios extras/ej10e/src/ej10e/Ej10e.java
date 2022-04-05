package ej10e;

import java.util.Random;
import java.util.Scanner;

public class Ej10e {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Random aleat = new Random();
        
        int num1 = aleat.nextInt(10);
        int num2 = aleat.nextInt(10);
        
        int mult = num1*num2;
        
        System.out.println("Ingrese su respuesta");
        int resp = leer.nextInt();
        
        if (resp == mult) {
            System.out.println("Ha encontrado la respuesta.");
        }else{        
        do {
            
            System.out.println("Ingrese otra respuesta");
            resp = leer.nextInt();
            
        } while (resp != mult);
        }

        
        
    }
    
}
