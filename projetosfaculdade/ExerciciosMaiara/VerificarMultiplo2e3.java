package projetosmaiara;

import java.util.Scanner;

public class VerificarMultiplo2e3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um n�mero:");
        int numero = ler.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O n�mero " + numero + " � m�tilplo de 2.");
        } else if (numero % 3 == 0) {
            System.out.println("O n�mero " + numero + " � m�ltiplo de 3.");
        } else {
            System.out.println("O n�mero " + numero + " n�o � m�ltiplo de 2 e 3.");
        }

    }
}
