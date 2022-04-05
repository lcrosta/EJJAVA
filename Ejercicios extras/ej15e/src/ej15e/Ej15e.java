package ej15e;

import java.util.Scanner;

public class Ej15e {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primero número");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo número");
        int num2 = leer.nextInt();
        
        System.out.println("¿Qué operación desea realizar?");
        System.out.println("S : Suma");
        System.out.println("R : Resta");
        System.out.println("M : Multiplicar");
        System.out.println("D : División");
        
        String resp = leer.next();
        
        switch (resp) {
            case "S":
                System.out.println("La suma es: " + suma(num1,num2));
                break;
            case "R":
                System.out.println("La resta es: " + resta(num1,num2));
                break;
            case "M":
                System.out.println("La multiplicación es: " + multiplicacion(num1,num2));
                break;
            case "D":
                System.out.println("La división es: " + division(num1,num2));
                break;
        }
        
    }
    
    public static int suma(int num1, int num2){
        int su = num1 + num2;
        return su;
    }
    
    public static int resta(int num1, int num2){
        int re = num1 - num2;
        return re;
    }
    
    public static int multiplicacion(int num1, int num2){
        int mul = num1*num2;
        return mul;
    }
    
    public static int division(int num1, int num2){
        int div = num1/num2;
        return div;
    }

    
}
