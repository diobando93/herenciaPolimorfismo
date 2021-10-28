package ej2;


public class Vehicle {
	
	public static void main (String[] args) {
		
		new Vehicle().iniciar(); //metodo no estatico
		Vehicle.parar(); //metodo estatico 
	}
	
	public Vehicle() {
		System.out.println("Constructor de la clase");
	}
	
	public void iniciar() {
		System.out.println("Iniciar vehiculo");
	}
	
	public void correr() {
		System.out.println("Correr vehiculo");
	}
	
	public static void parar() {		
		System.out.println("Parar vehiculo");
	}
	
}
