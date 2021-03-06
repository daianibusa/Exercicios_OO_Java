/* Escreva uma classe Data cuja instância (objeto) represente uma data. Esta classe deverá dispor dos
seguintes métodos:
construtor: define a data que determinado objeto (através de parâmetro), este método verifica se a
data está correta, caso não esteja a data é configurada como 01/01/0001
compara: recebe como parâmetro um outro objeto da Classe data, compare com a data corrente e
retorne:
 0 se as datas forem iguais;
 1 se a data corrente for maior que a do parâmetro;
-1 se a data do parâmetro for maior que a corrente.
getDia retorna o dia da data
getMes retorna o mês da data
getMesExtenso retorna o mês da data corrente por extenso
getAno retorna o ano da data
isBissexto retorna verdadeiro se o ano da data corrente for bissexto e falso caso contrário
clone o objeto clona a si próprio, para isto, ele cria um novo objeto da classe Data com os
mesmos valores de atributos e retorna sua referência pelo método */

package br.com.orientacao.objeto.exercicios_oo.exerciciocomdatas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class Data {

    //confere se a data é valida
    //regex serve para conferir se uma string segue certo padrões que vc pode configurar no regex
    // YYYY-MM-DD
    private static Pattern DATE_PATTERN = Pattern.compile(
            "^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)$"
                    + "|^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))$"
                    + "|^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$"
                    + "|^(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))$");


    private LocalDate currentDate = LocalDate.now();
    private LocalDate date;

    public Data(String data) {
        //dd/MM/yyyy <- Quero esta configuração para a data
        //vê se a data passada por parametro esta no padrão certo
        // metodo que valida e formata a data

        // tenta executar to  do o bloco
        // e caso aconteça algum erro
        try {
            //retorna um booleano
            if (DATE_PATTERN.matcher(data).matches()) {
                //atende a config dd/MM/YYYY
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                // parsiei a string para LocalDate
                //Atribui para o atributo da classe
                this.date = LocalDate.parse(data);
                // formatei a data
                String dataFormatada = this.date.format(formatter);
                // printa a data formatada
                System.out.println("LocalDate depois de formatar: " + dataFormatada);
            }
        }catch (Exception e){
            //cai na exception
            System.out.println("Data invalida");
        }
    }

    public int compara(LocalDate data) {
        //  comparar valor recebido como parametro (data) com a data recorrente ( LocalDate.now() )
        // retornar 0 caso sejam iguais
        // retornar 1 caso recorrente for maior
        // -1 caso data corrente seja menor
        if (data.isEqual(this.currentDate)) {
            return 0;
        } else if (data.isAfter(this.currentDate)) {
            return 1;
        } else {
            return -1;
        }
    }

    public int getDate() {
        System.out.println(this.date);
        return this.date.getDayOfMonth();
    }

    public int getMes() {
        System.out.println(this.date);
        return this.date.getMonthValue();

    }

    public int getYear() {
        System.out.println(this.date);
        return this.date.getYear();
    }

    public boolean isBissexto() {
        if ((this.date.getYear() % 4 == 0) && (this.date.getYear() % 100 != 0)) {
            return true;
        } else if (this.date.getYear() % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isBissexto(int ano) {
        if ((ano % 4 == 0) && (ano % 100 != 0)) {
            return true;
        } else if (ano % 400 == 0) {
            return true;
        } else {
            return false;

        }
    }
}
