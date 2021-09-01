package conteudo01;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o total de eleitores do município?");
        float eleitores = scanner.nextFloat();

        System.out.println("Quantos eleitores votaram em branco?");
        float votos_brancos = scanner.nextFloat();

        System.out.println("Quantos eleitores votaram nulo?");
        float votos_nulos = scanner.nextFloat();

        System.out.println("Quantos foram os votos válidos?");
        float votos_validos = scanner.nextFloat();


        System.out.println("As porcentagems de distribuíção dos votos foram: ");

        System.out.println("Votos em branco: " + (votos_brancos/eleitores)*100 + "%");
        System.out.println("Votos nulos: " + (votos_nulos/eleitores)*100 + "%");
        System.out.println("Votos válidos: " + (votos_validos/eleitores)*100 + "%");

        scanner.close();
    }
}
