
package projetosmaiara;

import java.util.Scanner;

public class DiferenteDeZeroOuPar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite algum n�mero: ");
        int numero = ler.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("O n�mero " + numero + " � par.");
        } else if(numero != 0){
            System.out.println("O n�mero " + numero + " � diferente de 0.");
        } 
    }
}
