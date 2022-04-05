package ej14e;

import java.util.Scanner;

public class Ej14e {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de familias");
        int n = leer.nextInt();
        
        int suma = 0;
        int contador = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese cuantos hijos tiene la familia " + i);
            int m = leer.nextInt();
            for (int j = 1; j <= m; j++) {
                System.out.println("Ingrese la edad del hijo número " + j);
                int ed = leer.nextInt();
                suma += ed;
                contador += + 1;
            }
        }
        
        System.out.println("La media de edad de los hijos de todas las familias es: " + (suma/contador));
        
        
    }
    
}
