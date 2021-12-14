package br.ufrn.imd.modelo;

public class SeguroVida implements Tributavel{
    int numero;
    String beneficiado;
    double valor;
    double taxa;

    @Override
    public double calculaTributos() {
        return 0;
    }
}
