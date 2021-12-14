package br.ufrn.imd.visao;

import br.ufrn.imd.controle.PistaException;
import br.ufrn.imd.modelo.Pista;

public class Aplicacao {
    public static void main(String[] args) {
        Pista p = new Pista();

        try {
            p.iniciar();
        }
        catch(PistaException pe) {
            System.out.println("Pista bloqueada");
            System.out.println("Causa :" + pe.getCause());
        }
    }
}
