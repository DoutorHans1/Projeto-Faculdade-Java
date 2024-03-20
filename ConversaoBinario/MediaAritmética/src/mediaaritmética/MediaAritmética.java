
package mediaaritmética;

public class MediaAritmética {

    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 9;
        int num3 = 7;
        
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;

        double media1 = (8 + 9 + 7) / 3;
        System.out.println(media1);
        
        double media2 = (4 + 5 + 6)/ 3;
        System.out.println(media2);
        
        double soma = media1 + media2;
        double media = soma / 2;
        
        System.out.println("A soma entre as medias é " + soma + " e a media entre os numeros é " + media );
        
    }
    
}
