package Atvs_Junho;

import java.util.Scanner;

public class vetor03 {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int []vetA = new int [5];
	int []vetB = new int [5];
	int []vetC = new int [10];
	
	
	System.out.println("Valores do Vetor A");
	for (int i= 0 ;i<5; i++) {
		System.out.println("Informe o "+(i+1)+ "° Número: ");
		vetA[i] =ler.nextInt();
		vetC[i] =vetA[i];
	}
	System.out.println("Valores do Vetor B");
	for (int i=0; i<5; i++) {
        System.out.println("Informe o "+(i+1)+" °Número: ");	
        vetB[i]=ler.nextInt();
        vetC[i+5]=vetB[i];

}
	System.out.println("Resultados: ");
	
	System.out.println("Vetor A:  ");
	for (int i=0; i<5; i++) {
		System.out.println(vetA[i]);
	}
	
	System.out.println("Vetor B:  ");
	for (int i=0; i<5; i++) {
		System.out.println(vetB[i]);
	}
	
	System.out.println("Vetor C (Junção):  ");
	for (int i=0; i<10;i++) {
		System.out.println(vetC[i]);
	}
	ler.close();
}}
