
package projetosfaculdade;

import java.util.Scanner;

public class Reajuste {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double num, reajuste, valorTotal;
        
        System.out.println("Digite um saldo: ");
        num = ler.nextDouble();
        
        reajuste = num * 0.05;
        
        valorTotal = reajuste + num;
        
        System.out.println("o valor do saldo com reajuste de 1% é: " + valorTotal);
    }
    
}
