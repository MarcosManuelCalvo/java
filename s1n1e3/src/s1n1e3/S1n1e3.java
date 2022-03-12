package s1n1e3;


/*
 * Exercici 3. Demostra que el procés de càrrega d'una classe
 * només té lloc una vegada. Demostra que la càrrega pot ser provocada
 * per la creació de la primera instància d'aquesta classe o per l'accés
 * a un membre estàtic d'aquesta. Idea: Cerca informació sobre els blocs
 * d'inicialització a Java.
 */

public class S1n1e3 {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.accelerar();
		Videojoc.iniciar();

		System.out.println("--------------------------------------------------");

		Videojoc j = new Videojoc();
		Vehicle.iniciar();
		j.accelerar();
		
		System.out.println("--------------------------------------------------");


		Videojoc w = new Videojoc();
		Vehicle s = new Vehicle();
	}
}
	class Vehicle{
		static {
			System.out.println("cárrega de clase vehicle estàtica");
		}
		{
			System.out.println("cárrega de clase vehicle");
		}
		
		Vehicle(){
			System.out.println("constructorVehicle");
		}
	
		public void accelerar() {
			System.out.println("mètodeVehicle");
		}
	
		public static void iniciar() {
			System.out.println("metodeEstaticVehicle");
		}
	}
	

	class Videojoc{
		static {
			System.out.println("cárrega de clase Videojoc estàtica");
		}
		{
			System.out.println("cárrega de clase Videojoc");
		}
		
		Videojoc(){
			System.out.println("constructorVideojoc");
		}
	
		public void accelerar() {
			System.out.println("mètodeVideojoc");
		}
	
		public static void iniciar() {
			System.out.println("metodeEstaticVideojoc");
		}
	}

