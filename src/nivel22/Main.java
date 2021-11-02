package nivel22;

public class Main {
	
	public static void main(String [] args) {
		
		Roedor [] roedores = new Roedor[2]; 
		
		roedores[0] = new Raton();
		roedores[1] = new Jerbo();
		
		for(Roedor roedor:roedores) {
			roedor.comer();
			roedor.correr();
			roedor.olisquear();
		}
	}

}
