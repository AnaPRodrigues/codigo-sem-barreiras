package conteudoArray;
// Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números negativos.

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        try(Scanner in = new Scanner(System.in)){
            var programaContinua = true;
            var quantidade = 0;
            var indice = 0;

            var numeros = new ArrayList<Integer>();

            while (programaContinua && indice < 0){
                System.out.println("Digite um numero novo número: ");
                var variavelteste = in.nextInt();
                indice++;
                if (variavelteste < 0){
                    numeros.add(variavelteste);
                    quantidade++;
                }

                System.out.println("Deseja digitar mais um número: [s] e [n]");

                if(in.next().charAt(0) == 'n'){
                    programaContinua = false;
                }
            }
            System.out.println("Os números digitados que são negativos foram: ");
            System.out.println(numeros);
            System.out.println("A quantidade itens com valor negativo é: "+ quantidade);
        }
    }
}
