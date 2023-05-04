import com.sun.source.tree.UsesTree;

public class Motor {
    private int potencia = 0;
    private double classificacao = 0.0;
    private int valvulas = 0;

    public Motor(int pot, double classificacao, int valv){
        this.potencia = pot;
        this.classificacao = classificacao;
        this.valvulas = valv;
    }

    public int getPotencia(){
        return potencia;
    }

    public void setPotencia(int potencia){
        this.potencia = potencia;
    }

    public double getClassificacao(){
        return classificacao;
    }

    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }

    public int getValvulas() {
        return valvulas;
    }

    public void setValvulas(int valvulas) {
        this.valvulas = valvulas;
    }
}
