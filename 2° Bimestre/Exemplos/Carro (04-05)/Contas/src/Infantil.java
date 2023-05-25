public class Infantil extends Contas implements Gastar{

    public Infantil(double saldo) {
        super(saldo);
    }
    @Override
    public double comprar(double valorCompra) { //ta implementando o método compra
        setSaldo(getSaldo() - valorCompra/2); //metade da conta da kid papai paga, ai só desconta 50% da conta da kid
        return getSaldo();
    }
}
