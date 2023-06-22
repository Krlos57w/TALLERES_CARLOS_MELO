package primer_cifra;
import java.util.Scanner;

public class Primer_cifra {
	 public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Introduce un numero entero de hasta 5 cifras: ");
	        int numero = scanner.nextInt();
	  int primeraCifra;

	        if (numero < 0) {
	            numero = -numero;
	        }

	        if (numero < 10) {
	            primeraCifra = numero;
	        } else if (numero < 100) {
	            primeraCifra = numero / 10;
	        } else if (numero < 1000) {
	            primeraCifra = numero / 100;
	        } else if (numero < 10000) {
	            primeraCifra = numero / 1000;
	        } else {
	            primeraCifra = numero / 10000;
	        }

	        System.out.println("La primera cifra del numero introducido es: " + primeraCifra);

	        scanner.close();
	        
	    }

}
