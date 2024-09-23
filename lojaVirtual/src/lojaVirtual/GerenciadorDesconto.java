package lojaVirtual;

public class GerenciadorDesconto {
    public void aplicarDesconto(Carrinho carrinho, double percentual) {
        for (Produto produto : carrinho.getProdutos()) {
            double precoComDesconto = produto.getPreco() * (1 - percentual / 100);
            produto.setPreco(precoComDesconto);
        }
    }
}
