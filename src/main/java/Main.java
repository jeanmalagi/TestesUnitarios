public class Main {
    public static void main(String[] args) {
        Produto bola = new Produto("Bola de Futebol", 50.0);
        Produto tenis = new Produto("Tênis de Corrida", 200.0);

        Loja loja = new Loja();
        loja.comprar(bola, "segunda");
        loja.comprar(tenis, "domingo");
        loja.comprar(bola, "quarta");

        Carrinho carrinho = loja.getCarrinho();
        System.out.println("Total da compra: R$ " + carrinho.calcularTotal());
    }
}
