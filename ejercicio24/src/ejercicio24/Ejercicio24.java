package ejercicio24;


import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de las filas y columnas");
        int tam = leer.nextInt();
        int tam2 = leer.nextInt();
        
        int[][] matriz = new int[tam][tam2];
        
        System.out.println("Ingrese los datos de la matriz");
        
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam2; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        
        int[][] matriztraspuesta = new int[tam][tam2];
        
        
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam2; j++) {
                matriztraspuesta[j][i] = matriz[i][j];
                matriz[i][j] = -matriz[i][j];
            }
        }
        
        if (Arrays.deepEquals(matriz, matriztraspuesta)) {
            System.out.println("Es una matriz antisimetrica");
        } else {
            System.out.println("No es antisimetrica");
        }

    }
    
}
