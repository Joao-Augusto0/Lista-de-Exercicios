package modelo;

import java.util.Scanner;
public class Ex13 {
public static Scanner leia;
	public static void main(String[] args) {

		leia = new Scanner(System.in);
		
		float salario,salarioF; 
		int filhos;
		System.out.print("quantos filhos o senhor tem?:");
		filhos = leia.nextInt();
		System.out.print("digite o seu salario:");
		salario = leia.nextFloat();
		
		if (salario <= 1655.98) {
			salarioF = (float) (filhos * 56.47);
			System.out.printf("vc recebera:"+salarioF);
		}else {
			System.out.printf("voce n�o tem os requisitos para o salario familia");
		}
	}
}