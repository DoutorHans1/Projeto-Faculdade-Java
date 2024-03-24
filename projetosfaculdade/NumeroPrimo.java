
package faculdadeages;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);        
        int numeroPrimo;
        
        System.out.println("Digite um numero: ");
        numeroPrimo = ler.nextInt();
        
        boolean primo = true;
        
        for (int i = 2; i < numeroPrimo; i++){
            if (numeroPrimo % i == 0 ){
                primo = false;
            }
        }
        if (primo){
            System.out.println("O numero " + numeroPrimo + " é primo");
        } else {
            System.out.println("O numero " + numeroPrimo + " não é primo");
        }
    }        
}
