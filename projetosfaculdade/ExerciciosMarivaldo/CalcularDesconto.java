
package projetosmarivaldo;

import java.util.Scanner;

public class CalcularDesconto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float preco;
        float desconto;
        
        System.out.println("Digite o preço do produto: ");
        preco = ler.nextFloat();
        
        System.out.println("Digite em porcentagem (%) o desconto do produto: ");
        desconto = ler.nextFloat();
        
        float precoDesconto, precoFinal;
        
        precoDesconto = (desconto / 100 * preco);
        precoFinal = (preco - precoDesconto);
        
        System.out.println(precoFinal);
    }
}
