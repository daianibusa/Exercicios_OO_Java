/*Crie uma classe denominada Elevador para armazenar as informações de um elevador
dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no
prédio, excluindo o térreo, capacidade do elevador, e quantas pessoas estão presentes nele. A
classe deve também disponibilizar os seguintes métodos:
 Inicializa: que deve receber como parâmetros a capacidade do elevador e o total de
andares no prédio (os elevadores sempre começam no térreo e vazio);
 Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
houver espaço);
 Sai: para remover uma pessoa do elevador (só deve remover se houver alguém
dentro dele);
 Sobe: para subir um andar (não deve subir se já estiver no último andar);
 Desce: para descer um andar (não deve descer se já estiver no térreo);
 Finaliza: terminar o programa
Encapsular todos os atributos da classe. */

package br.com.orientacao.objeto.exercicios_oo.exercicio03;

public class Elevador implements ElevadorImpl{

    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador;
    private int TotalPessoasElevador;

    public Elevador(){

    }
    public Elevador(int andarAtual, int totalAndares, int capacidadeElevador, int quantidadePessoasNoElevador) {
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
        this.TotalPessoasElevador = TotalPessoasElevador;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getTotalPessoasElevador() {
        return TotalPessoasElevador;
    }

    public void setTotalPessoasElevador(int totalPessoasElevador) {
        TotalPessoasElevador = totalPessoasElevador;
    }

    @Override
    public void inicializa(int totalAndares, int capacidadeElevador) {
        totalAndares = totalAndares;
        capacidadeElevador = capacidadeElevador;
        andarAtual = andarAtual;
        TotalPessoasElevador = TotalPessoasElevador;

    }

    @Override
    public void entra() {
        if(capacidadeElevador > TotalPessoasElevador){
            int total = TotalPessoasElevador + 1;
            System.out.println("O elevador tem capacidade para " + capacidadeElevador + " pessoas.");
            System.out.println("Atualmente, tem " + total + " pessoas.");
            System.out.println("Restam apenas " + (capacidadeElevador - total) + " vagas.");
        }else{
            System.out.println("Não há mais vagas no elevador. ");
        }

    }

    @Override
    public void sai() {
        if(TotalPessoasElevador > 0){
            TotalPessoasElevador = TotalPessoasElevador -1;
            System.out.println("Pessoa removida com sucesso");
        }else{
            System.out.println("Não há pessoas para remover.");
        }

    }

    @Override
    public void sobe() {
        if (andarAtual != totalAndares){
            int proximoAndar = andarAtual + 1;
            System.out.println("O elevador subiu para o " + proximoAndar + " andar.");
        }else{
            System.out.println("O elevador está no último andar.");
        }

    }

    @Override
    public void desce() {
        if(andarAtual != 0){
            int desce = andarAtual -1;
            System.out.println("O elevador vai descer para para o " + desce + " andar.");
        }else{
            System.out.println("O elevador já está no térreo.");
        }

    }
}
