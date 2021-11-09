import java.util.ArrayList;

public class Deposito {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionaProduto(Produto produto) {
        if(produtos.add(produto)){
            System.out.println("Produto adicionado");
        }
        else{
            System.out.println("Ocorreu um erro, produto nao adicionado");
        }
    }
    
    public void removeProduto(Produto produto) {
        if(produtos.remove(produto)){
            System.out.println("Produto removido");
        }
        else{
            System.out.println("Produto inexistente no depósito");
        }
    }
    
    public void informaQuantidadeProdutos() {
        System.out.println("O deposito tem um total de: " + produtos.size() + " produtos");
    }
    
    public void informaDepositoVazio(){
        if(!produtos.isEmpty()){
            System.out.println("O deposito nao esta vazio");
        }
        else{
            System.out.println("O deposito esta vazio");
        }
    }

    public Produto buscaProdutoMaisCaro() {
        double maiorPreco = produtos.get(0).getPreco();
        Produto produtoMaisCaro = produtos.get(0);

        for(Produto produto : produtos){
            if(produto.getPreco() > maiorPreco){
                maiorPreco = produto.getPreco();
                produtoMaisCaro = produto;
            }
        }
        return produtoMaisCaro;
    }

    public void informaProdutoMaisCaro() {
        if(produtos.isEmpty()){
            System.out.println("O depósito está vazio");
            return;
        }
        else{
            Produto produto = buscaProdutoMaisCaro();
            System.out.println("O produto com o maior preco e o(a) : " + produto.getNome());
            System.out.println("O preco e: " + produto.getPreco() + "R$");
        }
    }

}
