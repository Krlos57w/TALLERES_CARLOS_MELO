package promedio_de_3notas_Carlosm;

import java.util.Scanner;

public class Promedio_de_3notas_Carlos_m {
	 public static void main(String[] args) {
	        double NotaT1=0,NotaT2=0,NotaT3=04;
	        double PromedioNotas;
	        
	        Scanner tecl = new Scanner(System.in);
	        
	        System.out.println("ingrese nota trimestre 1");
	        NotaT1 = tecl.nextDouble();
	        System.out.println("ingrese nota trimestre 2 ");
	        NotaT2 = tecl.nextDouble();
	        System.out.println("ingrese nota trimestre 3");
	        NotaT3=tecl.nextDouble();
	        PromedioNotas = (NotaT1+NotaT2+NotaT3)/3;
	        
	        if(PromedioNotas<3){
	            System.out.println("Su nota final es "+PromedioNotas+" A reprobado ");
	        }
	            if(PromedioNotas>=3){
	                System.out.println("la nota final es "+PromedioNotas+"A aprobado");
	                
	        }
	        
	        
	    }
	    

}
