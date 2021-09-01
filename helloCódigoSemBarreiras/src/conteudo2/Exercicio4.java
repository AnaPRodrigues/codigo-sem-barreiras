package conteudo2;

import java.util.Scanner;


public class Exercicio4 {

    /*
    Construa um algoritmo que leia 3 valores inteiros e positivos e:

    Encontre o maior valor
    Encontre o menor valor
    Calcule a média dos números lidos
     */

    public static void main(String[] args) {
        int maiorNumero = Integer.MIN_VALUE;
        int menorNumero = Integer.MAX_VALUE;

        double somaDosNumeros = 0;
        int numeroCorrente = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1º número");
        numeroCorrente = scanner.nextInt();

        if (numeroCorrente > maiorNumero) {
            maiorNumero = numeroCorrente;
        }

        if (numeroCorrente < menorNumero) {
            menorNumero = numeroCorrente;
        }

        somaDosNumeros = somaDosNumeros + numeroCorrente + 0.0;

        System.out.println("Digite o 2º número");
        numeroCorrente = scanner.nextInt();

        if (numeroCorrente > maiorNumero) {
            maiorNumero = numeroCorrente;
        }

        if (numeroCorrente < menorNumero) {
            menorNumero = numeroCorrente;
        }

        somaDosNumeros = somaDosNumeros + numeroCorrente + 0.0;

        System.out.println("Digite o 3º número");
        numeroCorrente = scanner.nextInt();

        if (numeroCorrente > maiorNumero) {
            maiorNumero = numeroCorrente;
        }

        if (numeroCorrente < menorNumero) {
            menorNumero = numeroCorrente;
        }

        somaDosNumeros = somaDosNumeros + numeroCorrente + 0.0;

        System.out.println("Maior número " + maiorNumero);
        System.out.println("Menor número " + menorNumero);
        System.out.println("Média " + somaDosNumeros / 3);

        scanner.close();

    }
}



