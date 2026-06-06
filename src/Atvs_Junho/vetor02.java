package Atvs_Junho;

import java.util.Scanner;

public class vetor02 {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int[] val= new int[5];
	int soma=0;
	
	System.out.println("Armazenamento de Valores: ");
	
	for (int i =0; i<5; i++){
		System.out.println("Informe o "+(i+1)+"° Número: ");
		val[i]= ler.nextInt();
		
		soma+= val[i];
	} 
	
	System.out.println("Resultado: ");
	
	if (soma>30) {
		System.out.println("A Soma dos Valores é: "+soma);
	}else {
		System.out.println("A Soma dos Valores é: "+soma+ "(Menor que 30)");
	}
	ler.close();
}
}
