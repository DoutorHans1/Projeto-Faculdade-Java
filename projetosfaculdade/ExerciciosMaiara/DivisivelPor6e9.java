
package projetosmaiara;

import java.util.Scanner;

public class DivisivelPor6e9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float numero;
        System.out.println("Digite um n�mero: ");
        numero = ler.nextFloat();
        
        if(numero % 6 == 0 && numero % 9 == 0){
            System.out.println("O n�mero � divisivel por 6 e por 9.");
        } else {
            System.out.println("O n�mero n�o � divis�vel por 6 e por 9.");
        } 
    }
}
