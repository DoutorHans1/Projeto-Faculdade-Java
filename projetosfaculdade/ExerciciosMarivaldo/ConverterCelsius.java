
package projetosmarivaldo;

import java.util.Scanner;

public class ConverterCelsius {
      public static void main(String[] args) {
          Scanner ler = new Scanner(System.in);
        double celsius, fahrenheit;
        
        System.out.println("Digite a temperatura em graus Celsius: ");
        celsius = ler.nextDouble();
        double conversaoC = celsius * 1.8 + 32;
        System.out.println("A temperatura " + celsius + "�C em Fahrenheit � " +
                conversaoC + "�F.");
        
        System.out.println("Digite a temperatura em Fahrenheit: ");
        fahrenheit = ler.nextDouble(); 
        double conversaoF = (fahrenheit - 32) / 1.8;
        long inteiroF = Math.round(conversaoF);
        
        System.out.println("A temperatura " + fahrenheit + "�F em Celsius � " + 
                inteiroF + "�C");
    }
}
