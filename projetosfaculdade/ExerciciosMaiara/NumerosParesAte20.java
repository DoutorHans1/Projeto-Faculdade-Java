package projetosmaiara;

public class NumerosParesAte20 {

    public static void main(String[] args) {

        int numero = 0;

        while (numero < 20) {
            numero++;
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
}
