package entity;
import jakarta.persistence.*;

@Entity
@Table (name = "endereco") //opcional, se não adicionar, ele deixa como o nome da própria classe
public class Endereco {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY) //gerando valor pro id automaticamente --> pode gerar de forma aleatoria, sequencial.. IDENTITY é sequencial
    @Column (name = "id_endereco")
    private int id;
    @Column
    private String rua;
    @Column
    private String cidade;

    public Endereco(String rua, String cidade) {
        this.rua = rua;
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", rua='" + rua + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }

    public String ExibeEndereco() {
        return getCidade();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

}
