
package projetosmarivaldo;

import java.util.Scanner;

public class TestandoCaseSwitch {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);        
        
        double n1, n2;
        double resultado = 0;
        System.out.println("Digite um numero");
        n1 = ler.nextDouble();
        System.out.println("Digite outro numero");
        n2 = ler.nextDouble();
        String operador;
        
        System.out.println("Digite um operador: ");
        operador = ler.nextLine();
        
        String operadores = "";
        
        switch(operadores){
            
            case "+": resultado = n1 + n2;
            break;
            case "-": resultado = n1 - n2;
            break;
            case "*": resultado = n1 * n2;
            break;
            case "/": resultado = n1 / n2;
            break;
            default: System.out.println("Digite apenas os numeros mencionados.");
            break;
            
        }
       
        System.out.println("O resultado é " + resultado);
    }
}
