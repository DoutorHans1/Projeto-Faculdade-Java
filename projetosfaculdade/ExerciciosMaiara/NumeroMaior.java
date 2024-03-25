
package projetosfaculdade;

import java.util.Scanner;

public class NumeroMaior {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Sistema de identificar o maior numero");
        
        double n1, n2;
        
        System.out.println("Digite um numero: ");
        n1 = ler.nextDouble();
        
        System.out.println("Digite outro numero: ");
        n2 = ler.nextDouble();
        
        String numeroV = "";
        
        while(!numeroV.equalsIgnoreCase("s")){
        
        if (n1 > n2){
            System.out.println("O numero maior entre os numeros " + n1 + " e " + n2 + " e: " + n1);
        } else if(n1 == n2){
            System.out.println("Os numeros sao iguais." + n1 + " e " + n2);
        } else {
            System.out.println("O numero maior entre os numeros " + n1 + " e " + n2 + " e: " + n2);
        }
        
        System.out.println("Voce deseja sair? Se sim, tecle s: ");
        numeroV = ler.next();
    }
    }
}
