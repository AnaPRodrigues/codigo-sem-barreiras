package conteudo2;

import java.util.Scanner;

public class Exercicio5 {
    /* Escreva um algoritmo em Java que seja capaz de fazer as seguintes operações matemáticas
    (adição, subtração, multiplicação e divisão). Todas as operações serão entre dois valores.
    No começo do algoritmo pergunte ao usuário qual operação ele deseja fazer e quais são os valores.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultado = 0;

        System.out.println("Qual operação matemática você deseja realizar?");
        System.out.println("Se adição, digite '+'");
        System.out.println("Se subtração, digite '-'");
        System.out.println("Se divisão, digite '/'");
        System.out.println("Se divisão, digite '*'");

        String operador = scanner.next();

        System.out.println("Qual será o primeiro número da operação? ");
        int numero1 = scanner.nextInt();

        System.out.println("Qual será o segundo número da operação? ");
        int numero2 = scanner.nextInt();


        if (operador.equals("+")) {
            resultado = numero1 + numero2;
        } else if (operador.equals("-")){
            resultado = numero1 - numero2;
        }else if (operador.equals("/")){
            resultado = numero1 / numero2;
        }else if (operador.equals("*")){
            resultado = numero1 * numero2;
        }

        System.out.println("O resultado da operação é " + resultado);

        scanner.close();

    }

}
