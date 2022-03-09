package app;

import java.util.Scanner;

public class funciones {
	
	public static String pideString(String mensaje) {
		Scanner sc  =  new Scanner(System.in);
		System.out.print(mensaje);
		return sc.nextLine();
	}
	
	public static boolean preguntabin(String frase) {
		Scanner sc  =  new Scanner(System.in);
		char c = sc.next().charAt(0);
		if(c!='n' && c!='s') {
			System.out.print("error input. \n");
		}
		System.out.print(frase);
		return 's' == c;
	}
	
	public static int pideInt(String mensaje) {
		Scanner sc  =  new Scanner(System.in);
		System.out.print(mensaje );
		int num =  sc.nextInt();
		return num;
	}
	
	public static char pideChar(String frase) {
		Scanner sc  =  new Scanner(System.in);
		System.out.print(frase);
		return sc.next().charAt(0);
	}
}
