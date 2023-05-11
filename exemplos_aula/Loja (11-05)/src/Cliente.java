public class Cliente {

   private String nome;
   private String cpf;
   private int codigo;

    public Cliente(String nome, String cpf, int codigo) {
        this.nome = nome;
        this.cpf = cpf;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void exibirCliente(){
        System.out.println("\n°°Infomações cliente:°°\nNome: " + getNome() + "\nCPF: "+ getCpf() + "\nCódigo: " + getCodigo());
    }

}
