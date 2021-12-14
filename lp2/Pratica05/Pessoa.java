import java.util.Date;

public class Pessoa {
    protected String nome;
    protected Date dataNascimento;

    
    
    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getDataNascimento() {
        return dataNascimento.getDay() + "/" + dataNascimento.getMonth() + "/" + dataNascimento.getYear();
    }



    public void setDataNascimento(int ano, int mes, int dia) {
        this.dataNascimento = new Date(ano,mes,dia);
    }


    public String toString() {
        return "Nome: " + "<" + nome + ">" + "\n" +
               "Data de Nascimento " + "<" + getDataNascimento() + ">";

    }
}