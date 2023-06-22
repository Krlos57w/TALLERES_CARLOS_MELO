package numero_inverso;
import java.util.Scanner;

public class Numero_inverso {
	public static void main(String[] args) {
     
        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);
        
        // Pide al usuario que ingrese los 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero #" + (i+1) + ": ");
            numeros[i] = scanner.nextInt();
        }
          // Muestra los números en orden inverso
          System.out.println("Los numeros ingresados en orden inverso son:");
          for (int i = 9; i >= 0; i--) {
              System.out.println(numeros[i]);
          }
    }
    

}
