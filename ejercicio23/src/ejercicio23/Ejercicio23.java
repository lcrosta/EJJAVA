package ejercicio23;

import java.util.Random;

public class Ejercicio23 {

    public static void main(String[] args) {
        
        int[][] matriz = new int[4][4];
        
        Random aleat = new Random();
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = aleat.nextInt(9);
            }
        }
        
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        
    }
    
}
