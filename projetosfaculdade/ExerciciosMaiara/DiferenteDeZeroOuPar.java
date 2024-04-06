
package projetosmaiara;

import java.util.Scanner;

public class DiferenteDeZeroOuPar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite algum número: ");
        int numero = ler.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("O número " + numero + " é par.");
        } else if(numero != 0){
            System.out.println("O número " + numero + " é diferente de 0.");
        } 
    }
}
