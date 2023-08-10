import entity.Pessoa;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Jojo", "Tavares Marques", "jojomarques@email.com");
        Pessoa p2 = new Pessoa("Maris", "Morita Ouchi", "maraya123@email.com");
        Pessoa p3 = new Pessoa("Juana", "Patraycia Félix", "juanito123@email.com");
        Pessoa p4 = new Pessoa("Millaina", "Cupolaila", "millaininha123@email.com");


        Session session = HibernateUtil.getSessionFactory().openSession(); //criei a sessão, peguei a sessão e abri a sessão
        Transaction transaction = session.beginTransaction();

        session.persist(p1);
        session.persist(p2);
        session.persist(p3);
        session.persist(p4);

        transaction.commit(); //fechar a transação

        List <Pessoa> pessoas = session.createQuery("from Pessoa", Pessoa.class).list(); //from nomedaclasse

        pessoas.forEach(p -> System.out.println(p));

        /*
        for (Pessoa p : pessoas){
           System.out.println(p);
       }
        */

    }

}
