package Atvs_Junho;

import java.util.Scanner;

public class corrida {
public static void main(String[] args) {

	        Scanner ler =new Scanner(System.in);
	        

	        int carroA = 0;
	        int carroB = 0;
	        int rodada = 1;

	        System.out.println("Bem-Vindo !!!");
	        System.out.println("A corrida termina assim que um dos carros atingir 100 metros.");

	    
	        do {
	            System.out.println("RODADA " + rodada);
	            
	     
	            System.out.print("Quantos metros o Carro A percorreu nesta rodada? ");
	            int avancoA = ler.nextInt();
	            carroA += avancoA;

	            System.out.print("Quantos metros o Carro B percorreu nesta rodada? ");
	            int avancoB = ler.nextInt();
	            carroB += avancoB;

	            System.out.println("Distância atual - Carro A: " + carroA + "| Carro B: " + carroB );

	            
	            if (carroA < 100 && carroB < 100) {
	                if (carroA >carroB) {
	                    System.out.println(" Carro A está na frente!!!");
	                } else if (carroB > carroA) {
	                    System.out.println("Carro B está na frente!!!");
	                } else {
	                    System.out.println("Os carros estão empatados!!!");
	                }
	            }
	            
	            
	            rodada++;

	        } while (carroA < 100 && carroB < 100);

	      
	        System.out.println("Fim da Corrida!!!");
	        System.out.println("Distância Final - Carro A: " + carroA + " | Carro B: " + carroB );

	        if (carroA >= 100 && carroB >= 100) {
	            System.out.println("🤝 Incrível! Ambos cruzaram a linha de chegada na mesma rodada. EMPATE!");
	        } else if (carroA >= 100) {
	        	System.out.println("Vencedor: Carro A ");
	        
	        } else {
	            System.out.println("Vencedor: Carro B");
	        }

	        ler.close();
	    }

}

