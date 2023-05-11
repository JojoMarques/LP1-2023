public class Main {

    public static void main(String[] args) {

    Cliente clientes = new Cliente("jojo", "123.456.789-10", 001);
    Pedidos pedidos = new Pedidos(clientes, "água", 2.50f, 002);
    Loja loja = new Loja("lojinha");

    loja.addCliente(clientes); //vai adiconar na lista todas as coisas eu defini no meu cliente criado.loja.addCliente(clientes);
    loja.addPedidos(pedidos); //vai adiconar na lista todas as coisas eu defini no meu pedido criado.

        clientes.exibirCliente();
        pedidos.exibirPedidos();
        loja.exibirLoja();

    }
}
