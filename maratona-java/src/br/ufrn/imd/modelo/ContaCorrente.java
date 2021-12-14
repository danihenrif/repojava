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
        if(saldo - valor < 0){
            System.out.println("Impossível sacar um valor maior que o presente em sua conta");
        }
        else {
            this.saldo -= valor;
            System.out.println("Saque de " + valor + " em [" + this.numero + "] " + "efetuado com sucesso!");
        }
    }
    public void deposita(double valor){
        if(valor < 0){
            System.out.println("Impossível depositar um valor negativo");
        }
        else{
            this.saldo += valor;
            System.out.println("Deposito de " + valor + " em [" + this.numero + "] " + "efetuado com sucesso!");
        }
    }

    public boolean transfere(double valor, ContaCorrente cc) {
        if(valor < 0){
            System.out.println("Impossível transferir um valor negativo");
        }
        else if(valor > this.saldo){
            System.out.println("Voce nao tem toda essa grana");
        }
        else{
            saldo -= valor;
            double temp = cc.getSaldo();
            temp+=valor;
            cc.setSaldo(temp);
        }
    }


    @Override
    public double calculaTributos() {
        return saldo*0.038;
    }
}
