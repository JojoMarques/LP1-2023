import java.util.ArrayList;
import java.util.List;

public class Loja {

    private String nome_loja;
    private List<Cliente> clientes = new ArrayList<>();
    private List <Pedidos> pedidos = new ArrayList<>();

    public Loja(String nome_loja) {
        this.nome_loja = nome_loja;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    //adicionar na lista clientes
    public void addCliente(Cliente clientes){
        this.clientes.add(clientes);
    }

    public List<Pedidos> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedidos> pedidos) {
        this.pedidos = pedidos;
    }

    //adicionar na lista pedidos
    public void addPedidos(Pedidos pedidos){
        this.pedidos.add(pedidos);
    }

    public String getNome_loja() {
        return nome_loja;
    }

    public void setNome_loja(String nome_loja) {
        this.nome_loja = nome_loja;
    }

    public void exibirLoja(){
        System.out.println("\n°°Informações Loja:°°\nNome: " + getNome_loja());
    }

}
