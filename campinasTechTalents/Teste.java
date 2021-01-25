/*
Autor: Lucas Ribeiro de Pádua
*/
package campinasTechTalents;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        int numero_secreto = 5;
        int chute = 0;
        int tentativa = 1;
        boolean ganhou = false;

        System.out.println("\n");

        System.out.println(
                "Hora de apostar a sorte!\n" + "\n" + "Pensarei num número entre 0 a 10. Sua missão é adivinhar esse número!\n"+ "Lembre-se: você só tem 3 tentativas!\n");

        Scanner ler = new Scanner(System.in);

        while (tentativa < 4) {

            System.out.println("Tentativa " + tentativa + ": " + "qual o seu palpite?\n");
            chute = ler.nextInt();

            if (numero_secreto == chute) {
                System.out.println("Você acertou!\n");
                ganhou = true;
                break;

            } else if (numero_secreto > chute) {
                System.out.println("Você errou! meu número é MAIOR que esse.\n");
                tentativa++;

            } else {
                System.out.println("Você errou! meu número é MENOR que esse.\n");
                tentativa++;
            }
        }
        if (ganhou == false) {
            System.out.println("Você perdeu! Todas as suas tentativas foram usadas.");
        }
    }
}
