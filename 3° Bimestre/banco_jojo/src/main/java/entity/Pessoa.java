package entity;
import jakarta.persistence.*;

@Entity //deternmina que a classe é uma entidade do bdd
@Table (name = "pessoa")
public class Pessoa {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_pessoa")
    private int id;
    @Column
    private String nome;
    @Column
    private String sobrenome;
    @Column
    private String email;
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "endereco_id")
    private Endereco endereco_fk;

    public Pessoa(String nome, String sobrenome, String email, Endereco endereco_fk) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.endereco_fk = endereco_fk; //estrangeira de End
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ", endereco_fk=" + endereco_fk +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
