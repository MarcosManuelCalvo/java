package s1n1e1;

public class S1n1e1 {
	
	/*
	 * Exercici 1. Crea una classe Vehicle amb un constructor i un mètode anomenat iniciar(), que es invocat
	 * pel main() (aquest mètode pot estar en la mateixa classe o en una classe apart) . Demostra la seqüència
	 * d'execució dels mètodes de la classe (per exemple, enviant un missatge a la consola).
	 */

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		
		Vehicle.iniciar();
		
	}
}	
 		class Vehicle {
		//static int id =0;
		
		Vehicle(){
			//id++;
			System.out.print("constructor");
		}
		
		public static void iniciar() {
			System.out.print("metodeIniciar");
		}
		
		
	}


