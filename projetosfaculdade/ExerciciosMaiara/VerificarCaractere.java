
package projetosmaiara;

import java.util.Scanner;

public class VerificarCaractere {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        String vogais = "aeiou";
        String consoantes = "bcdfghjklmnpqrstvwxyz";
        String digitos = "0123456789";
        char caractere;
        
        
        
        System.out.println("Digite alguma coisa: ");
        caractere = ler.next().charAt(0);
        
        
        if(vogais.contains(String.valueOf(caractere))){
            System.out.println("Voc� digitou uma vogal");
        } else if(consoantes.contains(String.valueOf(caractere))) {
            System.out.println("Voc� digitou uma consoante");
        } else if(digitos.contains(String.valueOf(caractere))){
            System.out.println("Voc� digitou um d�gito.");
        } else {
            System.out.println("Voc� digitou um s�mbolo.");
        }
    }
}
