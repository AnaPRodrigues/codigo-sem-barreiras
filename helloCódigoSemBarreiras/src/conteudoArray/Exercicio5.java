package conteudoArray;

/*Escreva um algoritmo que simula um jogo da forca simples. o usuario precisara
 adivinhar uma palavra chutando cada letra em no máximo 10 chutes, caso o usuario acerte a
 letra o jogo dirá que ele acertou, caso tenha errado, o numero de tentativas vai diminuindo.
 Caso o numero de tentativas chegue a 0 o usuário perde.*/

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        try (var scanner = new Scanner(System.in)) {
            var tentativas = 10;

            System.out.println("-----------------------");
            System.out.println("Vamos brincar de forca?");
            System.out.println("-----------------------\n");

            System.out.println("Primeiro você precisa me dizer qual palavra será revelada: ");
            var palavra = scanner.next().toLowerCase();

            var palavraRevelada = "";

            System.out.println("Você tem 10 chutes para adivinhar qual palavra é!\n");

                for (int i = 0; i < palavra.length(); i++) {
                    palavraRevelada += "-";
                }

            System.out.println("A palavra que você deve adivinhar tem a seguinte quantidade de caracteres: \n");
            System.out.println("______");
            System.out.println("|    |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|" + palavraRevelada);

                var palavraAcertada = false;
                var quantidadeDeLetrasAcertadas = 0L;

                while (tentativas > 0 && !palavraAcertada) {
                    var houveAcerto = false;
                    System.out.println("\nDigite uma letra");
                    char letra = scanner.next().toLowerCase().charAt(0);

                    for (int i = 0; i < palavra.length(); i++) {
                        if (palavra.charAt(i) == letra) {

                            var palavraReservadaArray = palavraRevelada.toCharArray();
                            palavraReservadaArray[i] = palavra.charAt(i);
                            palavraRevelada = new String(palavraReservadaArray);
                            houveAcerto = true;
                            quantidadeDeLetrasAcertadas++;

                        }
                    }

                    if (!houveAcerto) {
                        tentativas--;
                        System.out.println("Infelizmente você errou, a letra " + letra + " não está na palavra a ser revelada\n");
                        System.out.println("Você ainda tem " + tentativas + " tentativas");
                        System.out.println("______");
                        System.out.println("|    |");
                        System.out.println("|");
                        System.out.println("|");
                        System.out.println("|" + palavraRevelada);

                    } else if (quantidadeDeLetrasAcertadas != palavra.length()) {
                        System.out.println("Parabéns!!! Você acertou a letra " + letra +"\n");
                        System.out.println("______");
                        System.out.println("|    |");
                        System.out.println("|");
                        System.out.println("|");
                        System.out.println("|" + palavraRevelada);
                    }

                    if (quantidadeDeLetrasAcertadas == palavra.length()) {
                        palavraAcertada = true;
                        System.out.println("Parabéns! A palavra " + palavraRevelada + " é a palavra a ser revelada!");

                    }
                }

                if (tentativas == 0 ){
                    System.out.println("Infelizmente não foi dessa vez, mas tente de novo!"
                            + "Boa sorte!");
                }
            }


    }
}
