package Atvs_Junho;

import java.util.Scanner;

public class lanchonete {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
    
  
    double total = 0.0;
    int Itens = 0;
    int escolha;

    System.out.println(" Bem-vindo à Lanchonete!");

    do {
       
        System.out.println(" Faça sua Escolha: ");
        System.out.println("1 - Hambúrguer -> R$20");
        System.out.println("2 - Refrigerante -> R$8");
        System.out.println("3 - Batata Frita -> R$15");
        System.out.println("4 - Finalizar pedido");
        System.out.print("Escolha uma opção: ");
        
        escolha = ler.nextInt();

       
        switch (escolha) {
            case 1:
                total += 20.0;
                Itens++;
                System.out.println("Hambúrguer adicionado!");
                break;
            case 2:
                total += 8.0;
                Itens++;
                System.out.println("Refrigerante adicionado!");
                break;
            case 3:
                total += 15.0;
                Itens++;
                System.out.println("Batata Frita adicionada!");
                break;
            case 4:
                System.out.println("Processando seu pedido...");
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
        }

    } while (escolha != 4);
    
    double desconto = 0.0;
    if (total > 100.0) {
        desconto = total * 0.10;
        total -= desconto;
        System.out.println(" Parabéns! Você ganhou 10% de desconto por comprar acima de R$100.");
    }

   
    System.out.println("Resumo do Pedido: ");
    System.out.println("Quantidade de itens comprados: " + Itens);
    if (desconto > 0) {
        System.out.printf("Desconto aplicado:", desconto);
    }
    System.out.printf("Valor da compra: "+ total);
    

    ler.close();
}
}
