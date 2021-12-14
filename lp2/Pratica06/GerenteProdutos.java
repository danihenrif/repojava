import java.util.ArrayList;

public class GerenteProdutos {
    private static ArrayList<Produto> produtos = new ArrayList<Produto>();
    
    public void addProduto(Produto produto) { 
        produtos.add(produto);
    }

    public static ArrayList<Ingrediente> Ingredientes(String nomeProduto) {
        for(Produto produto : produtos){
            if(produto.getNome().equals(nomeProduto) && produto instanceof ProdutoFabricado){
                return ((ProdutoFabricado)produto).getIngredientes();
            }
        }
        System.out.println("Produto inexistente");return null;
    }

    public static String valorCompra() {
        String stringRetorno = "";
        for(Produto produto : produtos){
            if(produto instanceof ProdutoComprado){
                stringRetorno += produto.getNome() + " : " + ((ProdutoComprado)produto).getCusto() + "\n"; 
            }
        }
        return stringRetorno;
    }

    public static void main(String[] args) {
        GerenteProdutos gerente = new GerenteProdutos();


        Produto p1 = new ProdutoComprado();
        Produto p2 = new ProdutoComprado();
        Produto p3 = new ProdutoComprado();
        Produto p4 = new ProdutoFabricado();
        Produto p5 = new ProdutoFabricado();
        Produto p6 = new ProdutoFabricado();

        p1.setNome("Macarrao");
        ((ProdutoComprado)p1).setCusto(5);

        p2.setNome("Feijao Preto");
        ((ProdutoComprado)p1).setCusto(10);

        p3.setNome("Arroz");
        ((ProdutoComprado)p1).setCusto(3);

        p4.setNome("Hamburguer");
        p5.setNome("Macarronada");
        p6.setNome("Salada de frutas");

        Ingrediente i1p4 = new Ingrediente("hamburguer", 2);
        Ingrediente i2p4 = new Ingrediente("queijo",5);
        Ingrediente i3p4 = new Ingrediente("pao",3);
        
        Ingrediente i1p5 = new Ingrediente("macarrao", 10);
        Ingrediente i2p5 = new Ingrediente("queijo",5);
        Ingrediente i3p5 = new Ingrediente("molho",7);
        
        Ingrediente i1p6 = new Ingrediente("uva", 10);
        Ingrediente i2p6 = new Ingrediente("banana",1);
        Ingrediente i3p6 = new Ingrediente("melao",2);

        //Adiciona os ingredientes
        ((ProdutoFabricado)p4).addIngrediente(i1p4);
        ((ProdutoFabricado)p4).addIngrediente(i2p4);
        ((ProdutoFabricado)p4).addIngrediente(i3p4);

        ((ProdutoFabricado)p5).addIngrediente(i1p5);
        ((ProdutoFabricado)p5).addIngrediente(i2p5);
        ((ProdutoFabricado)p5).addIngrediente(i3p5);
        
        ((ProdutoFabricado)p6).addIngrediente(i1p6);
        ((ProdutoFabricado)p6).addIngrediente(i2p6);
        ((ProdutoFabricado)p6).addIngrediente(i3p6);

        gerente.addProduto(p1);
        gerente.addProduto(p2);
        gerente.addProduto(p3);
        gerente.addProduto(p4);
        gerente.addProduto(p5);
        gerente.addProduto(p6);

        
        valorCompra();
        
        ArrayList<Ingrediente> ingredientesp5 = Ingredientes("macarronada");

        for(Ingrediente ingrediente : ingredientesp5){
            System.out.println(ingrediente.getNome() + ": " + ingrediente.getPreco() + "R$ \n");
        }

    }
}
