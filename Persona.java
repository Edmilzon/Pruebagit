package Persona;

public class Persona {
	private String nombre ;
	private String apellido;
	private int ci;
	private int edad;
	
	public Persona (String nombre, String apellido, int ci, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.ci = ci;
		this.edad = edad;
	}
	
	public void dormir () {
		System.out.println("Durmiendo...");
	}
	
	public void comer () {
		System.out.println("Cominedo");
	}

}
