package projetosmaiara;

import java.util.Scanner;

public class VerificarCaractere2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String vogais = "aeiou";
        String consoantes = "bcdfghjklmnpqrstvwxyz";
        String digitos = "0123456789";
        String caractere;

        System.out.println("Digite alguma coisa: ");
        caractere = ler.nextLine();

        if (caractere.length() == 1) {

            if (vogais.contains(caractere)) {
                System.out.println("Você digitou uma vogal");
            } else if (consoantes.contains(caractere)) {
                System.out.println("Você digitou uma consoante");
            } else if (digitos.contains(caractere)) {
                System.out.println("Você digitou um dígito.");
            } else {
                System.out.println("Você digitou um símbolo.");
            }
        } else {
            System.out.println("Digite apenas um caractere.");
        }
    }
}
