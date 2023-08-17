import entity.Endereco;
import entity.Pedidos;
import entity.Pessoa;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    //pra criar o de uma outra classe, tem que criar uma nova sessão e transação, ir lá em resources --> hibernate e adicionar o nome da classe que quer fazer o mapeamento


        Endereco e1 = new Endereco("Rua 1", "Cidade 1");
        Endereco e2 = new Endereco("Rua 2", "Cidade 2");
        Endereco e3 = new Endereco("Rua 3", "Cidade 3");
        Endereco e4 = new Endereco("Rua 4", "Cidade 4");

        Pessoa p1 = new Pessoa("Jojo", "Tavares Marques", "jojomarques@email.com", e1);
        Pessoa p2 = new Pessoa("Maris", "Morita Ouchi", "maraya123@email.com", e2 );
        Pessoa p3 = new Pessoa("Juana", "Patraycia Félix", "juanito123@email.com", e3);
        Pessoa p4 = new Pessoa("Millaina", "Cupolaila", "millaininha123@email.com", e4);

        Session session = HibernateUtil.getSessionFactory().openSession(); //criei a sessão, peguei a sessão e abri a sessão (Session é uma classe do Hibernate)
        //precisa de sessão pra realizar ações no bdd
        Transaction transaction = session.beginTransaction();

        session.persist(p1); //PERSIST --> recebe um objeto, e se for o objeto mapeado no bdd, ele salva ele como um registro no bdd
        session.persist(p2);
        session.persist(p3);
        session.persist(p4);

        transaction.commit(); //fechar a transação
        System.out.println("-------------------------------------------------------------------------------");

        List <Pessoa> pessoas = session.createQuery("from Pessoa", Pessoa.class).list(); //from nomedaclasse, isso pq ele nao mudou la (olhar class Endereco p entender)
        pessoas.forEach(p -> System.out.println(p));

        System.out.println("-------------------------------------------------------------------------------");
/*
        Session session2 = HibernateUtil.getSessionFactory().openSession(); //criei a sessão, peguei a sessão e abri a sessão
        Transaction transaction2 = session2.beginTransaction();//não precisa de transação pra fazer consulta

        session2.persist(e1);
        session2.persist(e2);
        session2.persist(e3);
        session2.persist(e4);

        transaction2.commit();//fechar a transação (boa prática do funcionamento do código)
        System.out.println("-------------------------------------------------------------------------------");

        List <Endereco> enderecos = session2.createQuery("from Endereco", Endereco.class).list(); //quando você busca registros no bdd, ele retorna um lista de regitros
        //create query --> cria um comando pro bdd que realiza uma determinada ação, ai a gente vai usar o SELECT FOROM (uma das existentes nele)
        //nome_da_classe.class --> pra qual classe ele vai converter os dados que ele pegar

        enderecos.forEach(e -> System.out.println(e)); //buscando o registro no bdd
 */
    }
}
