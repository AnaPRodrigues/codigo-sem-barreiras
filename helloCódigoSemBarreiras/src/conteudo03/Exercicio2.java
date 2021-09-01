package conteudo03;
// Construa um algoritmo usando uma estrutura de repetição que calcule o fatorial de um número.

import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fatorial = 0;
        int produto = 1;
        int texto = 0;

        System.out.println("Digite um número para fazer o fatorial: ");
        fatorial = scanner.nextInt();
        texto = fatorial;

        while (fatorial > 0){
            produto = fatorial * produto;
            fatorial = fatorial - 1;
        }

        System.out.println("O resultado do fatorial do número " + texto + " é " + produto);

         scanner.close();
    }

}
