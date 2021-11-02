package ej7;



public class Main {
	
	public static void main(String [] args) {
		Frog pepeRana = new Frog();
		pepeRana.correr();
		pepeRana.dormir();
		pepeRana.sonido();
		
		Amphibian anfibio = (Amphibian)pepeRana;
		anfibio.sonido();
				
		Frog ranita2 = (Frog) anfibio;
		ranita2.correr();
		ranita2.dormir();
		ranita2.saltar();
		ranita2.hablar();
	}
}
