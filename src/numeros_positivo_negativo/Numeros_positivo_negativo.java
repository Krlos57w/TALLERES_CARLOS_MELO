package numeros_positivo_negativo;
import java.util.Scanner;

public class Numeros_positivo_negativo {
	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantidadPositivos = 0;
        int cantidadNegativos = 0;
        int numero;
        
          System.out.println("Ingresa diez numeros:");

        for (int i = 1; i <= 10; i++) {
            numero = entrada.nextInt();

            if (numero >= 0) {
                cantidadPositivos++;
            } else {
                cantidadNegativos++;
            }
        }
         System.out.println("Cantidad de numeros positivos: " + cantidadPositivos);
        System.out.println("Cantidad de numeros negativos: " + cantidadNegativos);
    }

}
