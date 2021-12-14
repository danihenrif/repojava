package br.ufrn.imd.modelo;

public class Pessoa implements Tributavel{
    String nome;
    double salario;
    ContaCorrente conta;
    SeguroVida seguro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ContaCorrente getConta() {
        return conta;
    }

    public void setConta(ContaCorrente conta) {
        this.conta = conta;
    }

    public SeguroVida getSeguro() {
        return seguro;
    }

    public void setSeguro(SeguroVida seguro) {
        this.seguro = seguro;
    }

    @Override
    public double calculaTributos() {
        return this.salario * 0.11;
    }
}
