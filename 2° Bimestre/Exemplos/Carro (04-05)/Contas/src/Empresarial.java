public class Empresarial extends Contas implements Gastar, Retirada{
    private String cnpj;

    public Empresarial(double saldo, String cnpj) {
        super(saldo);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
}
    @Override
    public double comprar(double valorCompra) {
        setSaldo(getSaldo() - valorCompra);
    return getSaldo();
}
    @Override
    public double sacar(double valor) {
        setSaldo(getSaldo() - valor - (valor * 0.005));
     return getSaldo();
}
    @Override
    public double dividir(Integer divisor) {
        setSaldo(getSaldo()/divisor);
    return getSaldo();
}
}