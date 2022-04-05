package ej20e;

import java.util.Random;

public class Ej20e {

    public static void main(String[] args) {
        
    int[] vector = new int[5];    
    
    relleno(vector);
    
    mostrar(vector);
        
    }
    
    public static int[] relleno(int[] vector){
        Random aleat = new Random();
        for (int i = 0; i < 5; i++) {
            vector[i] = aleat.nextInt(50);
        }
        return vector;
    }
    
    public static void mostrar(int[] vector){
        for (int i = 0; i < 5; i++) {
            System.out.print(vector[i] + " ");
        }
    }
    
}
