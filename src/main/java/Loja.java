public class Loja {
    private Carrinho carrinho;

    public Loja() {
        carrinho = new Carrinho();
    }

    public void comprar(Produto produto, String diaDaSemana) {
        if (diaDaSemana.equalsIgnoreCase("domingo")) {
            System.out.println("A loja está fechada aos domingos. Não é possível comprar " + produto.getNome() + " neste dia.");
        } else {
            carrinho.adicionarProduto(produto);
        }
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }
}
