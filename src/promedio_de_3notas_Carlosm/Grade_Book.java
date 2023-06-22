package promedio_de_3notas_Carlosm;

import java.util.Scanner;

public class Grade_Book {
	 public static void main(String[] args) {
			
			
			Scanner lector = new Scanner(System.in);
			
			GradeBook planillaNotas = new GradeBook();
			
			System.out.println("Escriba el nombre del curso");
			String nombreCurso = lector.nextLine();
			
			planillaNotas.setNombreCurso(nombreCurso);
			
			planillaNotas.displayMessage();
		}

}
