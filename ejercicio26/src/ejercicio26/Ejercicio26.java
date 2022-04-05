package ejercicio26;

import java.util.Scanner;

public class Ejercicio26 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int[][] m = new int[10][10];
        int[][] p = new int[3][3];
        
        System.out.println("Ingrese números para la matriz M");
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                m[i][j] = leer.nextInt();
            }
        }
        
        System.out.println("Ingrese números para la matriz P");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                p[i][j] = leer.nextInt();
            }
        }
        
        int auxi = 0;
        int auxj = 0;
        int contador = 0;
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (m[i][j] == p[0][0]) {
                    auxi = i;
                    auxj = j;
                    if (m[i][j + 1] == p[0][1]) {
                        if (m[i][j + 2] == p[0][2]) {
                            contador++;
                        }
                    }
                }
                if (m[i][j] == p[1][0]) {
                    if (m[i][j + 1] == p[1][1]) {
                        if (m[i][j + 2] == p[1][2]) {
                            contador++;
                        }
                    }
                }
                if (m[i][j] == p[2][0]) {
                    if (m[i][j + 1] == p[2][1]) {
                        if (m[i][j + 2] == p[2][2]) {
                            contador++;
                        }
                    }
                }
            }
        }
        if (contador == 3) {
            System.out.println("Si contiene a la matriz, empieza en la posición " + auxi + " " + auxj);
        }
    }
    
}
