package modelo;

import java.util.Scanner;

public class Ex02 {
	public static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner(System.in);
		
		int velocidade,horas;
		float distancia; 
		
		System.out.print("digite a velocidade do carro em km/h:");
		velocidade = leia.nextInt();
		System.out.print("digite a distancia que vai percorrer em km:");
		distancia = leia.nextFloat();
		
		horas = (int) (distancia / velocidade); 
		
		System.out.printf("o tempo que vai demorar ate chegar ao seu destino ? aproximadamente: %d horas",horas);	
	}
}