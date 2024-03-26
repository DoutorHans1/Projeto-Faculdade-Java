
package projetosmaiara;

import java.util.Scanner;

public class ConversaoBinario {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        int numero;
        
        System.out.println("Digite um numero: ");
        numero = ler.nextInt();
        
        String binario = Integer.toBinaryString(numero);
        System.out.println("O numero digitado em binario é: " + binario);
        
        String hex = Integer.toHexString(numero);
        System.out.println("O numero digitado em hexadecimal é: " + hex);

    }
    
}
