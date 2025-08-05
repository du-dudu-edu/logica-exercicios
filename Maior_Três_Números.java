package logica_exercicios;

import java.util.Scanner;

public class Maior_Três_Números {

	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		

		System.out.println("Digite 3 números");
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int n3 = scn.nextInt();

		if(n1 < n2 & n3 < n2) {
        System.out.println("O maior número é: " + n2);
		}if(n2 < n1 & n3 < n1) {
	        System.out.println("O maior número é: " + n1);
		}if(n1 < n3 & n2 < n3) {
	        System.out.println("O maior número é: " + n3);
		}
        scn.close();
    }
}
