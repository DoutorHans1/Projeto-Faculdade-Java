package projetosmaiara;

import java.util.Scanner;

public class VerificarAdolescente {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int idade;
        float altura;

        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();

        System.out.println("Digite sua altura: ");
        altura = ler.nextFloat();

        if (idade >= 13 && idade <= 19) {
            if (altura < 1.60) {
                System.out.println("Você ainda é adolescente e tem menos de 1,60 metros de altura.");
            } else if (idade >= 13 && idade <= 19) {
                if (altura > 1.60) {
                    System.out.println("Você ainda é adolescente, mas tem mais de 1,60 metros de altura.");
                }
            }
        } else if (idade > 19 && altura > 1.60) {
            System.out.println("Você não é adolescente e tem mais de 1,60 metros de altura.");
        } else if (idade > 19 && altura < 1.60) {
            System.out.println("Você não é adolescente, mas tem menos de 1,60 metros de altura.");
        }
    }
}
