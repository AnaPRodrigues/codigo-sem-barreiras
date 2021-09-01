package conteudoExtra;
// Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5.

public class Exercicio4 {


    public static void main(String[] args) {
        int resultado = 0;
        int dividendo = 0;
        int rest = 1;

        for (int i = 1000; i < 2000; i++){
            resultado = i % 11;
            if (resultado == 5){
                System.out.println("O número " + i + " dividido por 11 tem como resto o número 5");
            }

        }
    }
}
