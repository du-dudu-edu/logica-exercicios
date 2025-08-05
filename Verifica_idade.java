package logica_exercicios;

import java.util.Scanner;

public class Verifica_idade {

	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		int id = scn.nextInt();
		
		if(id >=18) {
			System.out.println("Maior de idade");
		}else {
			System.out.println("Menor de idade");

		}
	}
}
