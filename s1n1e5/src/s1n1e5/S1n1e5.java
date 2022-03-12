package s1n1e5;
/*Exercici 5. Crea una classe Animal amb el mètode correr() sobrecarregat tres vegades.
 * Defineix una nova classe (per exemple Gat) que hereti de l'anterior i afegeix una nova versió
 * sobrecarregada del mateix mètode.
 * Mostra que els quatre mètodes estan disponibles a la classe derivada (per exemple enviant un missatge
 * a la consola).*/
public class S1n1e5 {
	public static void main(String[] args) {
		Gat g = new Gat();
		g.correr();
		g.correr('f');
		g.correr(70);
		g.correr("running");
		g.correr(40, 0);
	}
}
	class animal {
		
		
		public void correr() {
			System.out.println("correm ");
		}
		
		public void correr(int km) {
			System.out.println("correm "+km);
		}
		
		public void correr(String tipus) {
			System.out.println("correm "+tipus);
		}
		
		public void correr(char b) {
			System.out.println("correm "+b);
		}	
	}
	
	class Gat extends animal{
		

		public void correr(int km, int vel) {
			System.out.println("correm "+km+" y "+vel);
		}
		
	}

