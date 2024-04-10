
package projetosmarivaldo;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int n1, n2;
        String operacoesPermitidas = "+-*/";
        String operacoes = "";
        
        System.out.println("Digite um número: ");
        n1 = ler.nextInt();
        
        System.out.println("Digite outro número: ");
        n2 = ler.nextInt();
        
        ler.nextLine();
        
        System.out.println("Digite uma das operações seguintes(+-*/): ");
        operacoes = ler.nextLine();
        
        if(!operacoesPermitidas.contains(operacoes)){
            System.out.println("Digite apenas as operações permitidas.");
        }
        
        switch(operacoes){
            case "+":
                int soma = n1 + n2;
                System.out.println(soma);
                break;
        }
    }
}
