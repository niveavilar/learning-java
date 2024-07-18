package cartao;


public class TransacaoCartao {
    private String produtoNome;
    private double preco;

    public TransacaoCartao(String produtoNome, double preco) {
        this.produtoNome = produtoNome;
        this.preco = preco;
    }

    public String getProdutoNome() {
        return produtoNome.substring(0, 1).toUpperCase() + produtoNome.substring(1);
    }


    public double getPreco() {
        return preco;
    }

}
