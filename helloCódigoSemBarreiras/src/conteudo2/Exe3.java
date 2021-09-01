package conteudo2;

import java.util.Scanner;
public class Exe3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero1 = scanner. nextInt();

        System.out.println("Digite outro número inteiro: ");
        int numero2 = scanner. nextInt();

        if (numero1 > numero2) {
            System.out.println("O número " + numero1 + " é o maior número");
        } else {
            System.out.println(" O número " + numero2 + " é o maior número");
        }

        scanner.close();
    }
}
