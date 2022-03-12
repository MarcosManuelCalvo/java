package s1n1e4;
/*Exercici 4. A la classe Vehicle afegeix un camp static final,
 * un camp final i un camp static. Demostra la diferència entre els tres.
 * Quins es poden inicialitzar al constructor de la classe?*/
public class S1n1e4 {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Vehicle j = new Vehicle();
	}
}	
 	class Vehicle {
 		private static int idMatricula=0;//comú a tots els vehicles, es pot no inicialitzar
 		private final int matricula;//no es pot modificar, s'inicialitza a la deficicio o al constructor
 		private static final int model = 071;// S'ha d'inicialitzar a la definicio
		
	Vehicle(){
		matricula = idMatricula;//un cop inicialitzat no es por modificar
		idMatricula++;//es pot modificar
		System.out.println("matricula "+matricula);
		System.out.println("model "+model);
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
