
package projetosmaiara;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float n1, n2, n3, n4, media;
        
        System.out.println("Digite a primeira nota: ");
        n1 = ler.nextFloat();
        System.out.println("Digite a segunda nota: ");
        n2 = ler.nextFloat();
        System.out.println("Digite a terceira nota: ");
        n3 = ler.nextFloat();
        System.out.println("Digite a quarta nota: ");
        n4 = ler.nextFloat();
        
        media = (n1 + n2 + n3 + n4) / 4;
        
        System.out.println("A m�dia do aluno foi: " + media);
        
        if(media < 7){
            System.out.println("Reprovado!");
        } else {
            System.out.println("Aprovado!");
        } 
    }
}
