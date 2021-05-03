package br.com.orientacao.objeto.exercicios_oo.exercicio03;

import java.util.Scanner;

public class ElevadorAplication {

    public static void main(String[] args) {

        Elevador elevador = new Elevador();
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe qual é o andar atual do elevador: ");
        elevador.setAndarAtual(scan.nextInt());
        System.out.println("Informe o total de andares do prédio: ");
        elevador.setTotalAndares(scan.nextInt());
        System.out.println("Informe a capacidade de elevador: ");
        elevador.setCapacidadeElevador(scan.nextInt());
        System.out.println("Informe a quantidade de pessoas que já estão no elevador: ");
        elevador.setTotalPessoasElevador(scan.nextInt());

        elevador.inicializa(10, 5);
        elevador.entra();
        elevador.sai();
        elevador.sobe();
        elevador.desce();
    }
}
