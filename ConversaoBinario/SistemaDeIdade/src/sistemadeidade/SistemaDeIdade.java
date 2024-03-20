
package sistemadeidade;

import java.util.Scanner;

public class SistemaDeIdade {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int idade, anos, mes, meses, dia, resultado;
        
        System.out.println("Quantos anos você tem? ");
        idade = ler.nextInt();
        anos = idade * 365;

        System.out.println("Em qual mês voce nasceu? ");
        mes = ler.nextInt();
        meses = mes * 30;
        
        System.out.println("Em que dia voce nasceu? ");
        dia = ler.nextInt();
        
        resultado = idade + meses + dia;
        
        System.out.println("Voce tem " + resultado + " dias de vida");
    }
}
