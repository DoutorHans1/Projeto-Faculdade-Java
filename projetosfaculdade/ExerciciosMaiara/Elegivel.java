
package projetosmaiara;

import java.util.Scanner;

public class Elegivel {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int idade;
        
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();
        
        if(idade >= 16){
            System.out.println("Você tem " + idade + " anos. Pode votar.");
        } else {
            System.out.println("Você ainda é menor de idade, não pode votar.");
        }
    }
}
