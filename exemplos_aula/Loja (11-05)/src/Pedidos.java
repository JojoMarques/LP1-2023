public class Pedidos {

    private Cliente cliente;
    private String produto;
    private float valor;
    private int codigo;


    public Pedidos(Cliente cliente, String produto, float valor, int codigo) {
        this.cliente = cliente;
        this.produto = produto;
        this.valor = valor;
        this.codigo = codigo;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void exibirPedidos(){
        System.out.println("\n°°Informações Pedidos:°°\nProduto: " + getProduto() + "\nValor: " + getValor() + "\nCódigo: " + getCodigo());
    }

}
