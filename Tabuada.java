package logica_exercicios;

import java.util.Scanner;

public class Tabuada {

	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Insira uma valor para calcular");
		int n1 = scn.nextInt();
		
		
		for(int i = 1; i<=10;i++) {
			System.out.println(n1 + " X " + i +" : " + (n1*i));
		}
	}
}
