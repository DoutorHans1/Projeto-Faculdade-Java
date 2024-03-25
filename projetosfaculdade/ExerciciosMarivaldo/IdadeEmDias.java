
package projetosfaculdade;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int idade,mes, dia, idadeAno, mesAno, diaAno;
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();

        System.out.println("Digite o mes que voce nasceu: ");
        mes = ler.nextInt();
        
        System.out.println("Digite o dia que voce nasceu: ");
        dia = ler.nextInt();
        
        idadeAno = idade * 365;
        mesAno = mes * 30;
        diaAno = dia + mesAno + idadeAno;


        System.out.println(diaAno);
        
        
        
    }
}
