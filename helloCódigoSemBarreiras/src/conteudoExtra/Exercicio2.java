package conteudoExtra;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int divisor = 1;
        Scanner scanner = new Scanner(System.in);
        int resposta = 0;
        int primo = 1;

        System.out.println("Deseja saber se um número tem divisor ou se é primo? Digite: ");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        resposta = scanner.nextInt();

        while(resposta != 2){
            System.out.println("Digite o número que deseja saber a resposta: ");
            int numero = scanner.nextInt();
            for (int i = 0; i < numero; i++){
                while (numero != divisor) {
                    resposta = numero % divisor;
                    if (resposta == 0 && divisor != 1) {
                        System.out.println("O número " + numero + " tem como divisor o número: " + divisor);
                        primo = 0;
                    }
                    if (primo == 1 && divisor == (numero-1)) {
                        System.out.println(" O número " + numero + " é um número primo");
                    }
                    divisor++;
                }
            }
            System.out.println("Deseja saber se outro número tem divisor ou se é primo? Digite: ");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            resposta = scanner.nextInt();
            divisor = 1;
            resposta = 0;
            primo = 1;

        }

    scanner.close();

    }
}
