
package projetosfaculdade;

import java.util.Scanner;


public class Identificacao {
  
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String nome, idade, cidade, prof;
        
        
        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();
        
        System.out.println("Digite sua idade: ");
        idade = ler.nextLine();
        
        System.out.println("Digite sua cidade: ");
        cidade = ler.nextLine();
        
        System.out.println("Digite o nome do professor(a): ");
        prof = ler.nextLine();
        
        System.out.println("Olá, meu nome é " + nome + " tenho " + idade + " anos e sou da cidade de "
                 + cidade + ". Estou aprendendo a programar com o(a) Prof. " + prof );

    }
    
}
