import java.util.ArrayList;

public class ProdutoFabricado extends Produto implements IProdutoFabricado {
    private int numeroIngredientes;
    private ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
    
    public float getCusto() {
        float custo = 0;
        for(Ingrediente ingrediente : ingredientes){
            custo += ingrediente.getPreco();
        }
        return custo;
    }

    public void getIngredientes(int numero) {
        Ingrediente temp = ingredientes.get(numero-1);
        System.out.println("-------------------------------------------------------------" );
        System.out.println("O ingrediente numero " + numero + " eh o " + temp.getNome());
        System.out.println("O seu preço eh " + temp.getPreco() + " R$" );
        System.out.println("-------------------------------------------------------------" );
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void addIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
        numeroIngredientes++;
    }

    public int getNumeroIngredientes() {
         return this.numeroIngredientes;
    }

}
