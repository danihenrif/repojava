public class Ingrediente {
    private String nome;
    private float preco;
    
    
    public Ingrediente(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public String getNome() {
        return this.nome;
    }
    
}