package ej1;

public class Vehicle {
	
	public Vehicle() {
		System.out.println("Constructor de la clase");
	}
	
	public void iniciar() {
		System.out.println("Iniciar vehiculo");
	}
	
	public static void main(String [] args) {
		new Vehicle().iniciar();
	}
	
}
