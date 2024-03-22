
package projetosfaculdade;

import java.util.Scanner;


public class NotaseFaltas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int faltas;
        double n1, n2, n3, n4, media;
        
        System.out.println("Digite a primeira nota: ");
        n1 = ler.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = ler.nextDouble();
        System.out.println("Digite a terceira nota: ");
        n3 = ler.nextDouble();
        System.out.println("Digite a quarta nota: ");
        n4 = ler.nextDouble();
        
        media = (n1 + n2 + n3 + n4)/4;
        
        System.out.println("Digite a quantidade de faltas: ");
        faltas = ler.nextInt();
        
        if (faltas <= 5 & media >= 7){
            System.out.println("Aluno aprovado!\n"
                    + "Faltas: " + faltas
                    + "\nNotas: " + media);
            
        } else if(faltas > 5 & media >= 7){
            System.out.println("Aluno reprovado por falta!"
                    + "\nFaltas: " + faltas
                    + "\nNotas: " + media);
        }else if(faltas <= 5 & media < 7){
            System.out.println("Aluno reprovado por media!"
                    + "\nFaltas: " + faltas
                    + "\nNotas: " + media);
        }else if(faltas > 5 & media < 7){
            System.out.println("Aluno reprovado por falta e media!"
                    + "\nFaltas: " + faltas
                    + "\nNotas: " + media);
        }
    }
}
