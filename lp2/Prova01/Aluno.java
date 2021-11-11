import java.util.HashSet;

public class Aluno {
    private String nome;
    private String cpf;
    private String dataDeNascimento;
    private HashSet<Treino> treinos = new HashSet<Treino>();

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    public void adicionaTreino(Treino treino){
        treinos.add(treino);
    }
    public void removeTreino(Treino treino){
        treinos.remove(treino);
    }

    

}
