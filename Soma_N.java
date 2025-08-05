package logica_exercicios;

import java.util.Scanner;

public class Soma_N {

	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Insira um número");
		int n1 = scn.nextInt();
		int soma= n1;
		
		while(n1>1) {
			soma= soma*(n1-1);
			n1--;
			
		}
		System.out.println(soma);
			
	
	}
}
