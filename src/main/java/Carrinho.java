import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos;

    public Carrinho() {
        produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println(produto.getNome() + " adicionado ao carrinho.");
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }
}
