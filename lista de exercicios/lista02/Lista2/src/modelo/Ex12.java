package modelo;

import java.util.Scanner;

public class Ex12 {
	public static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner(System.in);
		
		float salario,desconto;
		
		System.out.print("digite o seu salario:");
		salario = leia.nextFloat();
		
			 if( salario < 1903.98) {
                 System.out.print("N?o sera descontado nada do seu salario!");
                 
             }else if(salario > 1903.98 && salario < 2826.65) {
            	 
                 desconto =  (float) ((salario*7.5)/100);
                 salario = salario - desconto;
                 System.out.print("O desconto no seu salario ? de: " +desconto);
                 System.out.print("Seu sal?rio com desconto fica: "+ salario);
     
             }else if(salario > 2826.65 && salario < 3751.05) {
            	 
             	 desconto = (float) ((salario*15)/100);
                 salario = salario - desconto;
                 System.out.print("O desconto no seu salario ? de: " + desconto);
                 System.out.print("Seu sal?rio com desconto fica: "+ salario);
                       
             }else if(salario > 3751.05 && salario < 4664.68) {
            	 
                 desconto = (float) ((salario*22.50)/100);
                 salario = salario - desconto;
                 System.out.print("O desconto no seu salario ? de: " + desconto);
                 System.out.print("Seu sal?rio com desconto fica: " + salario);
           
             }else if(salario > 4664.68){
            	 
                 desconto= (float) ((salario*27.50)/100);
                 salario = salario - desconto;
                 System.out.print("O desconto no seu salario ? de: " + desconto);
                 System.out.print(" Seu sal?rio com desconto fica: " + salario);                           
             }else {
            	 System.out.printf("acabou!");
             }
	}
}                              	