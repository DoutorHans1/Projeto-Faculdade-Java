
package projetosmaiara;

import java.util.Scanner;

public class Elegivel {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int idade;
        
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();
        
        if(idade >= 16){
            System.out.println("Voc� tem " + idade + " anos. Pode votar.");
        } else {
            System.out.println("Voc� ainda � menor de idade, n�o pode votar.");
        }
    }
}
