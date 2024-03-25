
package projetosmarivaldo;

import java.util.Scanner;


public class Notas {


    public static void main(String[] args) {
    
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do aluno; ");
        String nomeAluno = ler.nextLine();
        
        double n1, n2, n3, n4;

        System.out.println("Digite a primeira nota: ");
        n1 = ler.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        n2 = ler.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        n3 = ler.nextDouble();
        
        System.out.println("Digite a quarta nota: ");
        n4 = ler.nextDouble();
        
        double media = (n1 + n2 + n3 + n4) / 4;
        
        System.out.println("A media de " + nomeAluno + " é " + media);
        
    }
    
}
