
package projetosmarivaldo;

import java.util.Scanner;

public class DeterminarIdade {
     public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
        
        int idade;
        
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();
        
        if (idade >= 18){
            System.out.println("Voc� � maior de idade.");
        } else {
            System.out.println("Voc� � menor de idade");
        }        
    }
}
