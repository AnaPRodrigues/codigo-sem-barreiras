package conteudo01;

import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {
        final int i = 5;
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        int mostrar = numero - 1;

        System.out.println(mostrar);

        scanner.close();

    }
}
