
package projetosfaculdade;

import java.util.Scanner;

public class OperacoesMatematicas {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int numero1,numero2, soma, subtracao, multiplicacao, divisao;
        
        System.out.println("Sistema de opera��es matem�ticas b�sico");
        
        System.out.println("Digite um n�mero: ");
        numero1 = ler.nextInt();
        System.out.println("Digite outro n�mero: ");
        numero2 = ler.nextInt();
        
        soma =  numero1 + numero2;
        subtracao = numero1 - numero2;
        multiplicacao = numero1 * numero2;
        divisao = numero1 / numero2;
        
        System.out.println("Resultados:"
                + "\nSoma: " + soma
                +"\nSubtra��o: " + subtracao
                +"\nMultiplica��o: " + multiplicacao
                +"\nDivis�o: " + divisao);
    }
}
