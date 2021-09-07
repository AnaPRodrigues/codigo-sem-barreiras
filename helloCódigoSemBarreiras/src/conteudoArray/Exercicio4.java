package conteudoArray;

import java.util.ArrayList;
import java.util.Scanner;

//Escreva um algoritmo que leia números, insira em um array e após mostre o maior valor.

public class Exercicio4 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            Integer armMaiorNumero = 0;

            var programaContinua = true;

            var numeros = new ArrayList<Integer>();

            while (programaContinua){
                System.out.println("Digite um numero novo número: ");
                numeros.add(in.nextInt());

                System.out.println("Deseja digitar mais um número: [s] e [n]");

                if(in.next().charAt(0) == 'n'){
                    programaContinua = false;
                }
            }

            for (Integer maiornumero : numeros){
                if (armMaiorNumero < maiornumero){
                    armMaiorNumero = maiornumero;
                }
            }

            System.out.println("O maior número digitado é: ");
            System.out.println(armMaiorNumero);
        }
    }
}
