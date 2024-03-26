
package projetosmarivaldo;

import java.util.Scanner;

public class ConverterPeso {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Calcular peso em marte e na lua.");
        
        double m, l, peso, pesoEmMarte, pesoEmLua;
        m = 1.62;
        l = 3.71;

        System.out.println("Digite seu peso: ");
        peso = ler.nextDouble();
        
        pesoEmMarte = (peso / 9.81) * m;
        System.out.println("Seu peso em marte é: " + pesoEmMarte);
        
        pesoEmLua = (peso / 9.81) * l;
        System.out.println("Seu peso na lua é: " + pesoEmLua);
    }
}
