package modelo;

import java.util.Scanner;

public class Ex04 {
	public static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner(System.in);
		
		int v = 900;
		int t;
		float d;
		
		System.out.print("digite a distancia h? ser percorrida em km:");
		d = leia.nextFloat();
		
		t = (int) (d / v);

		if (d < 900) {
			System.out.print("a viajem vai ser menor que "+t+" horas");
		}else {
			System.out.printf("sera necessario aproximadamente: %d horas para o 747-300 sobrevoar %.2f km",t,d);
	}
	}	
}