package ejericicio16;

import java.util.Scanner;

public class Ejericicio16 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena para su verificación: ");
        String frase = leer.nextLine();
        
        int largo = frase.length();
        
        String caracteres = frase.substring(0, largo-5);
        
        String partefinal;
        
        int contador = 0;
        
        for (int i = 0; i < 4; i++) {
            
            switch (i) {
                case 0:
                    if (frase.length() > 5) {
                        partefinal = frase.substring(largo-5, largo);
                        if ("&&&&&".equals(partefinal)) {
                        contador = contador + 1;
                    }
                    }
                    break;
                case 1:
                    if ("X".equals(frase.substring(0,1))) {
                        contador = contador + 1;
                    }
                    break;
                case 2:
                    if ("O".equals(frase.substring(largo-6, largo-5))) {
                        contador = contador + 1;
                    }
                    break;
                case 3:
                    if (caracteres.length()==5) {
                        contador = contador + 1;
                    }
                    break;   
                    
            }
            
        }
        
        if (contador == 4) {
            
            System.out.println("TODAS LAS LECTURAS FUERON CORRECTAS");
        } else {
            
            System.out.println("LECTURAS FALLADAS: " + (4-contador));
        }
        
    }
    
}
