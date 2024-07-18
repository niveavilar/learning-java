package cartao;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<TransacaoCartao> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean comprar(String produtoNome, double preco) {
        if (preco > saldo) {
            return false;
        }
        TransacaoCartao transacao = new TransacaoCartao(produtoNome, preco);
        compras.add(transacao);
        saldo -= preco;
        return true;
    }

    public List<TransacaoCartao> getCompras() {
        return compras;
    }

    public String listarCompras() {
        StringBuilder sb = new StringBuilder();
        for (TransacaoCartao transacao : compras) {
            sb.append(transacao.getProdutoNome()).append(" - R$ ").append(transacao.getPreco()).append("\n");
        }
        return sb.toString();
    }

}
