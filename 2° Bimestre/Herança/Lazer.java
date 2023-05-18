package gastos;

public class Lazer extends Gastos {
    private boolean importante;

    public Lazer(double valor, String nome, boolean importante) {
        super(valor, nome);
        this.importante = importante;
    }

    public boolean isImportante() {
        return importante;
    }

    public void setImportante(boolean importante) {
        this.importante = importante;
    }

    @Override
    public void MudarValor(double valor) {
        super.MudarValor(1.05 * valor);
    }
}
