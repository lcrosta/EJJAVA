package eje4;

import java.util.Scanner;

public class Eje4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número para transformarlo en romano");
        int num = leer.nextInt();
        
        if (num >= 1 && num <= 10) {
            romano(num);
        } else {
            do {
                System.out.println("Ingrese un valor entre 1 y 10");
                num = leer.nextInt();
            } while (num < 1 || num > 10);
            romano(num);
            
        }
        
    }
    
    public static void romano (int num){
        switch (num) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
        }
    }
}
