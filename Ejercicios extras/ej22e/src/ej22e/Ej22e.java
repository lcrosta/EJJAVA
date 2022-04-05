package ej22e;

import java.util.Scanner;

public class Ej22e {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de las filas y columnas");
        int n = leer.nextInt();
        int m = leer.nextInt();
        
        int suma = 0;
        
        int[][] matriz = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("La suma de los elementos de la matriz es de " + suma);
        
        
    }
    
}
