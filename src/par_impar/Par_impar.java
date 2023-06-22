package par_impar;
import java.util.Scanner;

public class Par_impar {
	 public static void main(String[] args) {
	        
	          Scanner sc = new Scanner(System.in);
	        int[] numeros = new int[8];
	        
	         //Solicitar los números
	        for (int i = 0; i < 8; i++) {
	            System.out.print("Ingrese el numero #" + (i + 1) + ": ");
	            numeros[i] = sc.nextInt();
	            
	              }

	        // Mostrar los números con su clasificación
	        for (int i = 0; i < 8; i++) {
	             System.out.print(numeros[i] + " es ");
	            if (numeros[i] % 2 == 0) {
	                System.out.println("un numero par");
	            } else {
	                  System.out.println("un numero impar");
	            }
	        }
	                    
	                    
	    }

}
