import java.time.LocalDate;

public class Produto { 
    protected String nome;
    protected double preco;
    protected String marca;
    protected String descricao;
    protected LocalDate dataFabricacao;

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setDataFabricacao(int ano, int mes, int dia) {
        dataFabricacao = LocalDate.of(ano, mes, dia);
    }
    
    //Getters
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public String getMarca() {
        return marca;
    }
    public String getDescricao() {
        return descricao;
    }
    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }
}
