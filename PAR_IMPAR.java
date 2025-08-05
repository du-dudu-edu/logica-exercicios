package logica_exercicios;

import java.util.Scanner;

public class PAR_IMPAR {
	
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número");
		numero = scn.nextInt();
		System.out.println("Seu numero é: " + numero );
		
		if(numero %2 == 0) {
			System.out.println("Seu número é par");
		}else {
			System.out.println("Seu número é impar");
		}
			
		
	}

}
