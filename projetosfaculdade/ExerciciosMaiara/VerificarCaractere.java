
package projetosmaiara;

import java.util.Scanner;

public class VerificarCaractere {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        
        char caractere;
        String vogais = "aeiou";
        
        System.out.println("Digite um caractere: ");
        caractere = ler.next().charAt(0);
        
        if(Character.isDigit(caractere)){
            System.out.println("O caractere " + caractere + " é um dígito.");
        } else if(vogais.indexOf(caractere) != -1){
            System.out.println("O caractere " + caractere + " é uma vogal");
        }
        
        
        
        
    }
 
}
