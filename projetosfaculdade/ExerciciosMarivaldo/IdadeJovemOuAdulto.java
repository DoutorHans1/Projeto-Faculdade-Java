
package projetosmarivaldo;

import java.util.Scanner;

public class IdadeJovemOuAdulto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade;
        
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();
        
        if(idade <= 17){
            System.out.println("Voc� � menor de idade.");
        } else {
            System.out.println("Voc� � maior de idade.");
        }
        if(idade >= 18 && idade <= 25){
                System.out.println("Voc� � um jovem adulto.");
        } else if(idade >= 60){
            System.out.println("Voc� � idoso.");   
        }
    }
}
