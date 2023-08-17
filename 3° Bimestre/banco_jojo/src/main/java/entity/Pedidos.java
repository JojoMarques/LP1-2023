package entity;
import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table
public class Pedidos {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedidos")
    private int id;
    @Column (name = "pessoa_fk")//?
    private Pessoa pessoa;
    @Column (name = "produtos_fk")//?
    private List <Produto> produtos = new ArrayList<Produto>();

    public Pedidos(Pessoa pessoa, List<Produto> produtos) {
        this.pessoa = pessoa;
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Pedidos{" +
                "id=" + id +
                ", pessoa=" + pessoa +
                ", produtos=" + produtos +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
