public class Main {

    public static void main(String[] args) {

        Contas c = new Infantil(5000.0);
        c.depositar(50.5);

        Infantil i = (Infantil) c; //casting de c para Infantil, atribuindo a i
        i.comprar(100.0);
        System.out.println(i.getSaldo());

        Empresarial e = new Empresarial(1000.0, "aa");
        System.out.println(e.sacar(50.0));

        Pessoal p = new Pessoal(1000.0, "123.456.789-12");
        p.sacar(50.0);
        System.out.println(p.getSaldo());

    }
}
