package ej4;

public class Vehicle {
	public final String propietario;//constante
	public static int numeroAsientos;
	public static final double altura = 1.35;
	//mas restrictivo no puede ir en un constructor
	public Vehicle(String propietario, int numeroAsientos) {
		this.propietario = propietario;
		this.numeroAsientos = numeroAsientos;
	}
	
	public static void main(String[] args) {
		System.out.println(Vehicle.altura);
		Vehicle.numeroAsientos = 4;
		Vehicle v1 = new Vehicle("Luis", 2);
		Vehicle v2 = new Vehicle("Eduard", 4);
		Vehicle v3 = new Vehicle("Isablel", 8);
	}
}
