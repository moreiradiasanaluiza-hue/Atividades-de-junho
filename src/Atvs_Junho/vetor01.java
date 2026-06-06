package Atvs_Junho;

import java.util.Scanner;

public class vetor01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String[] nome = new String[5];
		
		
		int i = 0;
		System.out.println("Login de Nomes:");
		
		for (i = 0; i < 5; i++) {
			System.out.println("Informe o " + (i + 1) + "° Nome");
			nome[i] = ler.next();
			
			
		} 
		
		System.out.println("Nomes Logados: ");
		

		for (i = 0; i < 5; i++) {
			System.out.println( (i+1) + " - " + nome[i]);
		}
		
		ler.close(); 
	}
}