import java.util.Scanner;

public class MatrizTraspuesta2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar valores de la matriz

        System.out.print("Ingrese el valor de N(filas): ");
        int N = scanner.nextInt();
        System.out.print("Ingrese el valor de M(Columnas): ");
        int M = scanner.nextInt();

        // Creacion de matriz con datos solicitados

        int[][] matriz = new int[N][M];
        
        // Creacion ciclos, Mostrar posicion

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                System.out.print("Posicion [" + i + "][" + j + "]: " );
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mostrar matriz original: ");
        mostrarMatriz(matriz);
        
        // Calculo matriz traspuesta
        
        int[][] matrizTraspuesta = new int[M][N];
        
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                matrizTraspuesta[j][i] = matriz[i][j];
            }
        } 
        
        // Imprimir matriz traspuesta
        
        System.out.println("Mostrar matriz traspuesta: ");
        mostrarMatriz(matrizTraspuesta);
        scanner.close();
    }

    // Creacion metodo para imprimir matriz

    public static void mostrarMatriz(int[][] matriz) {
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
