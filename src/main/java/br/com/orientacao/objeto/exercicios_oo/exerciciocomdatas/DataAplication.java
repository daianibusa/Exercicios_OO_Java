package br.com.orientacao.objeto.exercicios_oo.exerciciocomdatas;

import br.com.orientacao.objeto.exercicios_oo.exercicio01.PessoaApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Scanner;

@SpringBootApplication
public class DataAplication {

    public static void main(String[] args) {
        SpringApplication.run(PessoaApplication.class, args);
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a data no seguinte formato   YYYY-MM-DD: ");
        String data = scan.nextLine();
        Data dataClass = new Data(data);

        int comparador = dataClass.compara(LocalDate.of(2022,1,21));
        System.out.println("comparador: "+  comparador);
        System.out.println("DIA: " + dataClass.getDate());
        System.out.println("MES: "+ dataClass.getMes());
        System.out.println("ANO: " + dataClass.getYear());

        dataClass.isBissexto();
    }
    }