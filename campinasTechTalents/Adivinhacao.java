/*
Autor: Lucas Ribeiro de Pádua
*/
package campinasTechTalents;

import java.util.Scanner;
import java.util.Random;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numero = random.nextInt(11);
        int contador = 0;
        int usuario;

        System.out.println("Bem vindo ao Jogo da Adivinhação!\n" +
                "As regras são bem simples.\n" +
                "Irei pensar em um número entre 0 e 10 e você tentará adivinhar.\n" +
                "Mas lembre-se, você tem apenas 3 chances.\n" +
                "Boa sorte e que Começem os Jogos!!\n");

        usuario = sc.nextInt();

        while (usuario != numero) {

            System.out.println("Que pena, você errou...");

            if (usuario < numero){
                System.out.println("O chute foi menor que o número secreto.");
            }else {
                System.out.println("O chute foi maior que o número secreto.");
            }

            System.out.println("Resta(m) " + (3 - (contador + 1)) + " chance(s).\n");

            if (contador >= 2){
                System.out.println("O número era " + numero);
                System.out.println("GAME OVER");
                break;
            }
            usuario = sc.nextInt();
            contador = contador + 1;
        }

        if (usuario == numero){
            System.out.println("Parabéns, você acertou!");
        }
    }
}
