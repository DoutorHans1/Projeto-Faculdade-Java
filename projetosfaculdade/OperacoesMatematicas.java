
package projetosfaculdade;

import java.util.Scanner;

public class OperacoesMatematicas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero1,numero2, soma, subtracao, multiplicacao, divisao;
        System.out.println("Digite um número: ");
        numero1 = ler.nextInt();
        
        System.out.println("Digite outro número: ");
        numero2 = ler.nextInt();
        
        soma =  numero1 + numero2;
        subtracao = numero1 - numero2;
        multiplicacao = numero1 * numero2;
        divisao = numero1 / numero2;
        
        System.out.println("Resultados:"
                + "\nSoma: " + soma
                +"\nSubtração: " + subtracao
                +"\nMultiplicação: " + multiplicacao
                +"\nDivisão: " + divisao);
        
    }
}
