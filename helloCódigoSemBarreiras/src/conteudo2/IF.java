package conteudo2;

import java.util.Scanner;

class Exercicio02 {

    /*
    Elabore um algoritmo que dada a idade de um nadador classifique-o em uma das
    seguintes categorias:

    Infantil A = 5 a 7 anos
    Infantil B = 8 a 11 anos
    Juvenil A = 12 a 13 anos
    Juvenil B = 14 a 17 anos
    Adultos = Maiores de 18 anos
    */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma idade");
        int idade = in.nextInt();

        /*if (idade >= 5 && idade <= 7) {
            System.out.println("Infantil A");
        } else if (idade >= 8 && idade <= 11) {
            System.out.println("Infantil B");
        } else if (idade >= 12 && idade <= 13) {
            System.out.println("Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Juvenil B");
        } else if (idade >= 18) {
            System.out.println("Adultos");
        } else {
            System.out.println("Pessoa menor de 5 anos");
        }*/

        if (idade > 4 && idade < 8) {
            System.out.println("Infantil A");
        } else if (idade > 7 && idade < 12) {
            System.out.println("Infantil B");
        } else if (idade > 11 && idade < 14) {
            System.out.println("Juvenil A");
        } else if (idade > 13 && idade < 18) {
            System.out.println("Juvenil B");
        } else if (idade > 17) {
            System.out.println("Adultos");
        } else {
            System.out.println("Pessoa menor de 5 anos");
        }


        in.close();
    }

}

