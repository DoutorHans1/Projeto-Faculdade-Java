
package projetosmarivaldo;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Calcular valor de produto com 10% de desconto.");
        
        String produto;
        
        System.out.println("Digite o nome de um produto: ");
        produto = ler.nextLine();
        
        double valor, desconto, valorTotal;
        System.out.println("Digite o valor do produto: ");
        valor = ler.nextDouble();
        
        desconto = valor / 10;
        valorTotal = valor - desconto;
        
        System.out.println("O produto " + produto + " de valor " + valor +
                " com desconto de 10%, fica " + valorTotal);
    }
}
