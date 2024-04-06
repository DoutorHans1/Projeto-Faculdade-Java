package projetosmaiara;

import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int numeroPrimo;
        System.out.println("Digite um número: ");
        numeroPrimo = ler.nextInt();

        if (numeroPrimo < 1) {
            System.out.println("Digite um número inteiro positivo.");
        } 

        for (int contador = 2; contador <= numeroPrimo; contador++) {

            boolean primo = true;
            
            for(int divisor = 2; divisor * divisor <= contador; divisor++){
                if(contador % divisor == 0){
                    primo = false;
                }
            }
            if(primo){
                System.out.println(contador);
            }
        }
    }
}
