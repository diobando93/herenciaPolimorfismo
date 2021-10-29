package ej5;

public class AreaCuadrado extends Calculadora {
	public void suma() {
		System.out.println("Arrancar area del cuadrado");
	}
	public static void main(String[] args) {
		AreaCuadrado a = new AreaCuadrado();
		a.suma(13.5f, 14.5f);
		a.suma();
		a.suma(2, 3);
	}
	
}
