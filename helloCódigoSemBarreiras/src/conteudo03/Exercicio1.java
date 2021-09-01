package conteudo03;

/*Construa um algoritmo que leia 10 valores inteiros e positivos e:

Encontre o maior valor
Encontre o menor valor
Calcule a média dos números lidos Esse exercício foi dado na aula 3 e
agora vamos otimizar ele utilizando o while e for.
 */


import java.util.Scanner;
import java.lang.String;

public class Exercicio1 {
    public static void main(String[] args) {
        int maiorNumero = Integer.MIN_VALUE;
        int menorNumero = Integer.MAX_VALUE;

        double somaDosNumeros = 0;
        int numeroCorrente = 0;
        int soma = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º número");
            numeroCorrente = scanner.nextInt();

            if (numeroCorrente > maiorNumero) {
                maiorNumero = numeroCorrente;
            }

            if (numeroCorrente < menorNumero) {
                menorNumero = numeroCorrente;
            }

            soma = soma + numeroCorrente;

        }
        System.out.println("Maior número " + maiorNumero);
        System.out.println("Menor número " + menorNumero);
        System.out.println("Média " + soma / 10.0);

        scanner.close();

    }
}
