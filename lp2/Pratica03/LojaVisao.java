public class LojaVisao {
    public static void main (String[] args) {
        Deposito deposito1 = new Deposito();
        
        ProdutoDuravel carro = new ProdutoDuravel();
        ProdutoDuravel livro = new ProdutoDuravel();
        ProdutoDuravel celular = new ProdutoDuravel();

        ProdutoNaoDuravel chocolate = new ProdutoNaoDuravel();
        ProdutoNaoDuravel toalha = new ProdutoNaoDuravel();
        ProdutoNaoDuravel sabonete = new ProdutoNaoDuravel();

        //Inicialização os atributos
        carro.setNome("Celta");
        carro.setPreco(10000);
        carro.setMarca("Chevrolet");
        carro.setDescricao("ABABABABA");
        carro.setDataFabricacao(2009, 3, 14);
        carro.setDurabilidade(50);

        livro.setNome("O jeito HARVARD de ser feliz");
        livro.setPreco(24.89);

        celular.setNome("iPhone 13");
        celular.setPreco(6.687);

        chocolate.setNome("Ferrero Rocher");
        chocolate.setPreco(2);
        chocolate.setDataValidade(2021,10,4);
        chocolate.setGenero("Alimenticio");

        toalha.setNome("Toalha1");
        toalha.setPreco(40);
        
        sabonete.setNome("LUX");
        sabonete.setPreco(1.1);
        
        //Chamada dos métodos
        deposito1.informaDepositoVazio();

        deposito1.adicionaProduto(carro);
        deposito1.adicionaProduto(livro);
        deposito1.adicionaProduto(celular);
        deposito1.adicionaProduto(chocolate);
        deposito1.adicionaProduto(toalha);
        deposito1.adicionaProduto(sabonete);
        
        deposito1.informaQuantidadeProdutos();

        deposito1.removeProduto(toalha);

        deposito1.informaQuantidadeProdutos();

        deposito1.informaDepositoVazio();

        deposito1.informaProdutoMaisCaro();

    }
}
