package br.ufrn.imd.dao;
import br.ufrn.imd.modelo.Pessoa;

import java.util.ArrayList;

public class PessoaDAO {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void cadastraPessoa(Pessoa p) {
        pessoas.add(p);
    }

    public void removePessoa(Pessoa p) {
        pessoas.remove(p);
    }

    public void listaPessoas() {
        for(Pessoa pessoa : pessoas){
            System.out.println("Nome : " + pessoa.getNome());
            System.out.println("Salario : " + pessoa.getSalario());
            System.out.println("Agencia : " + pessoa.getConta().getAgencia());
            System.out.println("Conta : " + pessoa.getConta().getNumero());
            System.out.println("Saldo : " + pessoa.getConta().getSaldo());
            System.out.println("Seguro : " + pessoa.getSeguro().getNumero());
            System.out.println("Beneficiario : " + pessoa.getSeguro().getBeneficiado());
        }
    }


}
