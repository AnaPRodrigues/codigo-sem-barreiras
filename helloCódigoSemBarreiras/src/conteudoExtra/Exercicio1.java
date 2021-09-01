package conteudoExtra;
/*Faça um programa para calcular a série de Fibonacci para um número informado pelo usuário,
sendo F(0) = 0, F(1) = 1 e F(n)= F(n-1)+F(n-2)  Por exemplo, caso o usuário informe o número 9,
o resultado ser2ia: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 Faça um programa para calcular a série de
Fibonacci para um número informado pelo usuário, sendo F(0) = 0, F(1) = 1 e F(n)= F(n-1)+F(n-2) 
Por exemplo, caso o usuário informe o número 9, o resultado seria: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
 */

import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número para calcular a série de Fibonacci: ");
        int numero = scanner.nextInt();
        int var_2 = 1;
        int var_1 = 0;
        int resultado = 0;
        int variavel = 0;


        for (int i = 0; i  < numero-2; i++){
            if (variavel > 1 || variavel == numero){
                resultado = var_1 + var_2;
                System.out.printf("%d,", resultado);
                var_2 = var_1;
                var_1 = resultado;

            } else {
                System.out.printf("0,1,1,2,");
                var_1 = 2;
                variavel = 2;
            }

        }
        scanner.close();

    }

}
