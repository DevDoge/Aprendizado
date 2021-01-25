/*
Autor: Lucas Ribeiro de Pádua
*/
package CampinasTechTalentsUtilitarios;

public class IMCCalculo {
    private double massa = 0;
    private double altura = 0;
    private double calculo = 0;

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private void setCalculo(double calculo) {
        this.calculo = calculo;
    }

    public double getCalculo() {
        return calculo;
    }

    public double getMassa() {
        return massa;
    }

    public double getAltura() {
        return altura;
    }

    public void calcular(){
        double total = getMassa()/Math.pow(getAltura(), 2);
        setCalculo(total);
    }
}
