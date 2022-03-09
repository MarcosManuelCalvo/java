package s1n1e2;

/*
 Exercici 2. A la classe Vehicle afegeix dos mètodes: un static anomenat parar() i un altre no-static anomenat
 accelerar(). Demostra com invocar el mètode static i el no-static des del main() (per exemple, enviant un missatge
 a la consola).
 */

public class S1n1e2 {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Vehicle.iniciar();
		
		Vehicle.parar();
		v.accelerar();
	}
}	
 	class Vehicle {
		
	Vehicle(){
		System.out.print("constructor");
	}
		
	public static void parar() {
		System.out.print("parem");
	}
	
	public void accelerar() {
		System.out.print("accelerem");
	}
	
	public static void iniciar() {
		System.out.print("metodeIniciar");
	}
		
	
}
