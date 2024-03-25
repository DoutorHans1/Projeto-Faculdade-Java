
package projetosmarivaldo;

import java.util.Scanner;

public class CalcularIMC {
     public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);        
        double peso, altura, imc;
        
        System.out.println("Digite seu peso: ");
        peso = ler.nextDouble();
        System.out.println("Digite sua altura: ");
        altura = ler.nextDouble();
        
        imc = peso / (altura * altura);
        
        System.out.println("Seu IMC �: " + imc);
        
        if (imc <= 18.5){
            System.out.println("Voce est� abaixo do peso");
        } else if(imc <= 24.9){
            System.out.println("Voce est� com o peso ideal.");
        } else if(imc <= 29.9){
            System.out.println("Voce est� com sobrepeso.");
        } else if(imc >= 30){
            System.out.println("Voce est� obeso.");
        }  
    }
}
