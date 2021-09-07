package conteudoArray;

//Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números pares.
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            var programaContinua = true;

            var numeros = new ArrayList<Integer>();

            while (programaContinua){
                System.out.println("Digite um numero novo número: ");
                var variavelteste = in.nextInt();
                if (variavelteste % 2 == 0){
                    numeros.add(variavelteste);
                }

                System.out.println("Deseja digitar mais um número: [s] e [n]");

                if(in.next().charAt(0) == 'n'){
                    programaContinua = false;
                }
            }
            System.out.println("Os números digitados que são pares foram: ");


            System.out.println(numeros);
        }
    }
}
