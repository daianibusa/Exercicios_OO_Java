/*
Crie uma classe para representar uma pessoa, com os atributos privados nome, data de nascimento e altura.
Crie os métodos públicos nesecessários para sets e gets e também um método para imprimir todos os dados de uma pessoa.
Crie um método para clauclar a idade da pessoa.
 */

package br.com.orientacao.objeto.exercicios_oo.exercicio01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Pessoa {

    private String nome;
    private float altura;
    private Date dataNascimento;
    private int idade;

    //Construtores
    public Pessoa(){}

    public Pessoa(String nome, float altura, Date dataNascimento, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, float altura) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    private Integer calcularIdade(){
        Calendar dataAtual= Calendar.getInstance();
        int anoAtual = dataAtual.get(Calendar.YEAR);
        int mesAtual = dataAtual.get(Calendar.MONTH);
        int diaAtual = dataAtual.get(Calendar.DATE);

        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.setTime(this.dataNascimento);
        int anoNascimento = dataNascimento.get(Calendar.YEAR);
        int mesNascimento = dataNascimento.get(Calendar.MONTH);
        int diaNascimento = dataNascimento.get(Calendar.DATE);

        idade = anoAtual - anoNascimento;
        if(mesNascimento > mesAtual && diaNascimento < diaAtual){
            idade = idade-1;
        }else{
            idade = idade;
        }
        return idade;
    }


    public void imprimirInformaceos(){
        System.out.println("==========INFORMAÇÕES==========");
        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura);
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Data de nascimento: " + df.format(dataNascimento));
        System.out.println("Idade: " + calcularIdade());

    }
}
