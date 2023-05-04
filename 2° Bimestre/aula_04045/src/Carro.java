import java.util.ArrayList;
import java.util.List;

public class Carro {

    private String cor;
    private String modelo;
    private String placa;
    private int ano;
    private Motor motor; //uma classe está utilizando a outra (carro utiliza motor)
    private List <Roda> roda = new ArrayList<>();


    public Carro(String cor, String modelo, String placa, int ano, Motor motor) {
        this.cor = cor;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.motor = motor;
    }

    public void addRoda(Roda roda){
        this.roda.add(roda);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public List<Roda> getRoda() {
        return roda;
    }
}
