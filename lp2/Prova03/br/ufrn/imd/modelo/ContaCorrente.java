package br.ufrn.imd.modelo;

public class ContaCorrente implements Tributavel {
    String agencia;
    String numero;
    double saldo;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saca(double valor){

    }
    public void deposita(double valor){

    }

    public boolean transfere(double valor, ContaCorrente cc){
        
    }

    @Override
    public double calculaTributos() {

    }
}
