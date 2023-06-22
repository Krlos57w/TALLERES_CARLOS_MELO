package promedio_de_3notas_Carlosm;

public class GradeBook {
private String nombreCurso;
	
	
	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public void displayMessage() {
		System.out.println("Bienvenido al sistema de Notas: " + getNombreCurso());
	}  


}
