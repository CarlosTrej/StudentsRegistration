package notasAcademicas;

import javax.swing.JOptionPane;

public class Main {
	
	public static double promedioEstudiante(int nota1, int nota2, int nota3) {
		double promedio = (nota1 + nota2 + nota3)/3;
		return promedio;
	}//promedioEstudiante
	
	public static void condicionEstudiante(Estudiante estudiante[]) {
		for(int i = 0; i<estudiante.length; i++) {
			if(estudiante[i].getPromedio() >= 13) {
				estudiante[i].setCondicion("Aprobado");
			}else if(estudiante[i].getPromedio() < 13 && estudiante[i].getPromedio() >=10) {
				estudiante[i].setCondicion("Subsanación");
			}else {
				estudiante[i].setCondicion("Desaprobado");
			}//else
		}//for
	}//condicionEstudiante
	
	public static void main(String[] args) {
		int nMatricula, nota1, nota2, nota3, nEstudiantes;
		String nombre;
		double promedio;
		
		nEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos estudiantes deseas ingresar?"));
		Estudiante estudiante[] = new Estudiante[nEstudiantes];
		int j = 1;
		for(int i =0; i<estudiante.length; i++) {
			nMatricula = j;
			nombre = JOptionPane.showInputDialog("Ingresa el nombre del alumno con matrícula [ " + j + " ]");
			nota1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nota # 1 del alumno con matrícula [ " + j + " ]"));
			nota2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nota # 2 del alumno con matrícula [ " + j + " ]"));
			nota3 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nota # 3 del alumno con matrícula [ " + j + " ]"));
			promedio = promedioEstudiante(nota1, nota2, nota3);
			estudiante[i] = new Estudiante(nMatricula, nombre, nota1, nota2, nota3, promedio);
			j++;
		}//for
		
		condicionEstudiante(estudiante);
		
		for( Estudiante estudiantes: estudiante) {
			System.out.println(estudiantes);
		}//for
		
		
	}//main

}//Main
