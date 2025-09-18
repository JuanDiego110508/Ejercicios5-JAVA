import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/* Eliminar duplicados de un arreglo
Solicita números al usuario y crea un nuevo arreglo sin elementos repetidos. */

public class EliminarDuplicado4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<Integer> numeros = new HashSet<>();
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Ingrese los numero del arreglo(Ingrese -1 para terminar). ");

        while (true) {
            System.out.print("Numero: " );
            int numero = scanner.nextInt();
            
            if(numero == -1) {
                break;
            }

            if(!numeros.contains(numero)) {
                numeros.add(numero);
                lista.add(numero);
            } else {
                System.out.println("El numero " + numero + " ya existe. ");
            }
        }

        int[] arreglo = new int[lista.size()];

        for(int i = 0; i < lista.size(); i++) {
            arreglo[i] = lista.get(i);
        }
        System.out.print("Arreglo sin numeros repetidos: ");
        mostrarArreglo(arreglo);
        scanner.close();
    }
    public static void mostrarArreglo(int[] arreglo) {
        for (int numero : arreglo) {
                System.out.print(numero + " ");
            }
            System.out.println();
    }
}    


