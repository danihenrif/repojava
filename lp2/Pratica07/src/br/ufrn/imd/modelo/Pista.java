package br.ufrn.imd.modelo;

import br.ufrn.imd.controle.AcimaVelocidadeException;
import br.ufrn.imd.controle.PistaException;

public class Pista {
    Automovel a = new Automovel();
    public void iniciar() throws PistaException {
        try {
            a.acelerar(50);
            System.out.println("Acelerando... " + a.getVelocidadeAtual());
            a.acelerar(50);
            System.out.println("Acelerando... " + a.getVelocidadeAtual());
            a.acelerar(50);
        }
        catch (AcimaVelocidadeException ave) {
            throw new PistaException("Problema na pista!", ave);
        }
    }
}
