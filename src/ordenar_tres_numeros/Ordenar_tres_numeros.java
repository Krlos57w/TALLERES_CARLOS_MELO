package ordenar_tres_numeros;
import java.util.Scanner;

public class Ordenar_tres_numeros {
	  public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Introduce el primer numero: ");
	        int numero1 = scanner.nextInt();

	        System.out.print("Introduce el segundo numero: ");
	        int numero2 = scanner.nextInt();

	        System.out.print("Introduce el tercer numero: ");
	        int numero3 = scanner.nextInt();
	        
	        System.out.println("Numeros introducidos: " + numero1 + ", " + numero2 + ", " + numero3);

	        int temp;

	       if (numero1 > numero2) {
	            temp = numero1;
	            numero1 = numero2;
	            numero2 = temp;
	        }

	        if (numero2 > numero3) {
	            temp = numero2;
	            numero2 = numero3;
	            numero3 = temp;
	        }

	        if (numero1 > numero2) {
	            temp = numero1;
	            numero1 = numero2;
	            numero2 = temp;
	        }

	            
	            System.out.println("Numeros ordenados: " + numero1 + ", " + numero2 + ", " + numero3);

	        scanner.close();
	    }
	    

}
