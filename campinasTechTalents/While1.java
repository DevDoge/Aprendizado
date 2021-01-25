/*
Autor: Lucas Ribeiro de Pádua
*/
package campinasTechTalents;

import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int limite = 0;
        int contador = 0;

        System.out.println("Esse programa conta de 0 até quanto vc quiser.\n\n" +
                "Informe o limite em inteiro:");

        limite = sc.nextInt();

        while (limite >= 0){
            System.out.print(contador + " ");
            limite = limite -1;
            contador = contador +1;
        }
    }
}
