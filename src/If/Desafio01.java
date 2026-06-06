package If;

import java.util.Scanner;

public class Desafio01 {
public static void main(String[] args) {
	int nota1;
	int nota2;
	int nota3;
	int media;
	
	Scanner ler = new Scanner(System.in);
	System.out.println("Insira a Primeira Nota da Etapa: ");
	nota1=ler.nextInt();
	
	System.out.println("Insira a Segunda Nota da Etapa: ");
	nota2 = ler.nextInt();
	
	System.out.println("Insira a Terceira Nota da Etapa: ");
	nota3 = ler.nextInt();
	
	ler.close();
	media = ((nota1+nota2+nota3)/3);
	
	if (media >=7) {
		System.out.println("Parabéns Você foi Aprovado: média "+media);
		
}else {
	System.out.println("Reprovado: média "+media);
}

}
}
