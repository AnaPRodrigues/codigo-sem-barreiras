package conteudo01;

import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base do retângulo:");
        Float base = scanner.nextFloat();

        System.out.println("Digite a altura do retângulo: ");
        Float altura = scanner.nextFloat();

        System.out.println("A área do retângulo é: " + base * altura);

        scanner.close();

    }
}
