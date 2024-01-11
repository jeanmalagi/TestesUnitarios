import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CarrinhoTest {

    @Test
    public void testAdicionarProdutoAoCarrinho() {
        Produto produtoMock = mock(Produto.class);
        Carrinho carrinho = new Carrinho();

        carrinho.adicionarProduto(produtoMock);

        verify(produtoMock, times(1)).getNome();
    }

    @Test
    public void testCalcularTotalDaCompra() {
        Produto produto1 = new Produto("Bola de Futebol", 50.0);
        Produto produto2 = new Produto("Tênis de Corrida", 200.0);
        Carrinho carrinho = new Carrinho();

        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);

        assertEquals(250.0, carrinho.calcularTotal(), 0.01);
    }
}
