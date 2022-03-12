package s1n1e6;

/*
 * Exercici 6. Crea una classe denominada Amphibian i inclou una sèrie
 * de mètodes: moure(), respirar() i menjar(). Defineix una nova classe
 * denominada Frog que hereti de l'anterior. Al main() crea un objecte
 * Frog i realitza una generalització a Amphibian,
 * demostrant que tots els mètodes continuen funcionant.
 * */

public class S1n1e6 {
	public static void main(String[] args) {
		Frog f = new Frog();
		f.moure();
		f.respirar();
		f.menjar();
		Amphibian a = (Amphibian)f;
		a.moure();
		a.respirar();
		a.menjar();
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
}

class Frog extends Amphibian {
}
