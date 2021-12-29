package notasAcademicas;

public class Estudiante {
	private int nMatricula;
	private String nombre;
	private int nota11;
	private int nota2;
	private int nota3;
	private double promedio;
	private String condicion;
	
	
	public Estudiante(int nMatricula, String nombre, int nota11, int nota2, int nota3, double promedio,
			String condicion) {
		this.nMatricula = nMatricula;
		this.nombre = nombre;
		this.nota11 = nota11;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.promedio = promedio;
		this.condicion = condicion;
	}//EstudianteCosntructor


	public Estudiante(int nMatricula, String nombre, int nota11, int nota2, int nota3, double promedio) {
		this.nMatricula = nMatricula;
		this.nombre = nombre;
		this.nota11 = nota11;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.promedio = promedio;
	}//EstudianteCosntructorCondicion


	public double getPromedio() {
		return promedio;
	}//getPromedio


	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}//setPromedio


	public String getCondicion() {
		return condicion;
	}//getCondicion


	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}//setCondicion


	@Override
	public String toString() {
		return "Estudiante [nMatricula=" + nMatricula + ", nombre=" + nombre + ", nota11=" + nota11 + ", nota2=" + nota2
				+ ", nota3=" + nota3 + ", promedio=" + promedio + ", condicion=" + condicion + "]";
	}//toString
	
	
	
	
	
	
	
	
	
	

}//Estudiante
