package s1n1e8;
/*Exercici 8. Modifica l'exercici anterior perquè l'objecte Frog substitueixi les definicions de mètodes de la
 * classe base (proporcioni noves definicions utilitzant les mateixes signatures de mètodes).
 * Demostri que ocorre al mètode main(), si manté la generalització anterior o no.*/
public class S1n1e8 {
	public static void main(String[] args) {
			Frog f = new Frog();
			f.moure();
			f.respirar();
			f.menjar();
			f.saltar();
			Amphibian a = (Amphibian)f;
			a.moure();
			a.respirar();
			a.menjar();
			a.saltar();
	}	
}


		class Amphibian {
			
			Amphibian(){}
			
			public void moure() {
				System.out.println("moure");
			}
			public void respirar() {
				System.out.println("respirar");
			}
			public void menjar() {
				System.out.println("menjar");
			}
			public void saltar() {
				System.out.println("saltar");
			}
		}

		class Frog extends Amphibian {
			
			Frog(){
				System.out.println("Frog");
			}
			
			public void moure() {
				System.out.println("Frogmoure");
			}
			public void respirar() {
				System.out.println("Frogrespirar");
			}
			public void menjar() {
				System.out.println("Frogmenjar");
			}
			public void saltar() {
				System.out.println("Frogsaltar");
			}
		}

