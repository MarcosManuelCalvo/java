

public class S1n1e7 {
/*Exercici 7. A l'exercici anterior crea un nou mètode saltar() a la classe Frog i crida’l des del main(),
 * desprès de fer la generalització a Amphibian.
 * Demostra que la crida a aquest mètode saltar dona error.*/
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
}

class Frog extends Amphibian {
	public void saltar() {
		System.out.println("saltar");
	}
}