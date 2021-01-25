/*
Autor: Lucas Ribeiro de Pádua
*/
package campinasTechTalents;

import CampinasTechTalentsUtilitarios.IMCCadastro;
import CampinasTechTalentsUtilitarios.IMCCalculo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IMCTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = "###,###.##";
        DecimalFormat dF = new DecimalFormat(pattern);

        int posicao;

        System.out.println("Programa para calcular IMC de várias pessoas.\n\n" +
                "Informe quantas pessoas serão calculadas:");

        posicao = sc.nextInt();

        IMCCadastro[] pessoas = new IMCCadastro[posicao];
        IMCCalculo[] calculo = new IMCCalculo[posicao];


        for (int i = 0; i < posicao; i++) {
            pessoas[i] = new IMCCadastro();
            calculo[i] = new IMCCalculo();

            System.out.println("\nInforme o nome da " + (i + 1) + "ª pessoa:");
            pessoas[i].setPessoas(sc.next());

            System.out.println("Informe a idade da " + (i + 1) + "ª pessoa:");
            pessoas[i].setIdade(sc.nextInt());

            System.out.println("Informe a altura em metros da " + (i + 1) + "ª pessoa:");
            calculo[i].setAltura(sc.nextFloat());

            System.out.println("Informe a massa em quilogramas da " + (i + 1) + "ª pessoa:");
            calculo[i].setMassa(sc.nextFloat());

            System.out.println("\n");

            calculo[i].calcular();

            if (i == posicao - 1) {

                for (int j = 0; j < posicao; j++) {
                    if (calculo[j].getCalculo() < 18.5) {
                        System.out.println(pessoas[j].getPessoas() + " tem "
                                + pessoas[j].getIdade() + " anos e está com "
                                + dF.format(calculo[j].getCalculo()) + " de IMC, ou seja, está a baixo do peso.\n");

                    } else if (18.5 <= calculo[j].getCalculo() && calculo[j].getCalculo() < 25) {
                        System.out.println(pessoas[j].getPessoas() + " tem "
                                + pessoas[j].getIdade() + " anos e está com "
                                + dF.format(calculo[j].getCalculo())  + " de IMC, ou seja, está com o peso adequado.\n");

                    } else if (25 <= calculo[j].getCalculo() && calculo[j].getCalculo() < 30) {
                        System.out.println(pessoas[j].getPessoas() + " tem "
                                + pessoas[j].getIdade() + " anos e está com "
                                + dF.format(calculo[j].getCalculo())  + " de IMC, ou seja, está com sobrepeso.\n");

                    } else if (30 <= calculo[j].getCalculo() && calculo[j].getCalculo() < 35) {
                        System.out.println(pessoas[j].getPessoas() + " tem "
                                + pessoas[j].getIdade() + " anos e está com "
                                + dF.format(calculo[j].getCalculo())  + " de IMC, ou seja, está com obesidade (Grau I).\n");

                    }else if (35 <= calculo[j].getCalculo() && calculo[j].getCalculo() < 40) {
                        System.out.println(pessoas[j].getPessoas() + " tem "
                                + pessoas[j].getIdade() + " anos e está com "
                                + dF.format(calculo[j].getCalculo())  + " de IMC, ou seja, está com obesidade severa (Grau II).\n");

                    }else if (40 <= calculo[j].getCalculo()) {
                        System.out.println(pessoas[j].getPessoas() + " tem "
                                + pessoas[j].getIdade() + " anos e está com "
                                + dF.format(calculo[j].getCalculo())  + " de IMC, ou seja, está com obesidade mórbida (Grau III).\n");
                    }
                }
            }
        }
    }
}