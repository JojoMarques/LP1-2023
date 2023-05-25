public class Pessoal extends Contas implements Gastar, Retirada{
    private String cpf;

    public Pessoal(double saldo, String cpf) {
        super(saldo);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public double comprar(double valorCompra) {
        setSaldo(getSaldo() - valorCompra);
        return getSaldo();
    }

    @Override
    public double sacar(double valor) {
        setSaldo(getSaldo() - valor);
        return getSaldo();
    }

    @Override
    public double dividir(Integer divisor) {
        setSaldo(getSaldo()/divisor);
        return getSaldo();
    }

}
