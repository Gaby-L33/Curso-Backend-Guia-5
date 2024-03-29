
import java.util.Scanner;

/*
 Realice un programa que compruebe si una matriz dada es antisimétrica. 
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo. 
Es decir, A es antisimétrica si A = -AT. 
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio5PracticoGuia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la dimension de la matriz: ");
        int n = leer.nextInt();

        int[][] matriz = new int[n][n];

        System.out.println("Ingrese los valores de la matriz: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        //Mostrar matriz
        System.out.println("Matriz 1");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" ["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("------------------------------");
        //Mostrar traspuesta
        System.out.println("Matriz 2");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" ["+matriz[j][i]+"]");
            }
            System.out.println("");
        }

        boolean esAntisimetrica = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    esAntisimetrica = false;
                    break;
                }
            }
        }

        if (esAntisimetrica) {
            System.out.println("La matriz ES antisimetrica");
        } else {
            System.out.println("La matriz NO es antisimetrica");
        }
    }
    }
    

