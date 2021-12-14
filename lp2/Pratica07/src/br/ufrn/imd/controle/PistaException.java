package br.ufrn.imd.controle;
import br.ufrn.imd.controle.AcimaVelocidadeException;

public class PistaException extends Exception {
    public PistaException(String message, AcimaVelocidadeException ave) {
        super(message,ave);
    }
}
