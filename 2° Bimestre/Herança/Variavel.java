package gastos;

public class Variavel extends Gastos {
    private int tempoMeses;

    public Variavel(double valor, String nome, int tempoMeses) {
        super(valor, nome);
        this.tempoMeses = tempoMeses;
    }

    public int getTempoMeses() {
        return tempoMeses;
    }

    public void setTempoMeses(int tempoMeses) {
        this.tempoMeses = tempoMeses;
    }
}
