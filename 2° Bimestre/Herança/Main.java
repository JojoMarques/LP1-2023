package gastos;

public class Main {

    public static void main(String[] args) {

        Lazer l1 = new Lazer (100.00, "Shopping", true);
        Lazer l2 = new Lazer (70.00, "Cinema", true);
        Variavel v1 = new Variavel(12.00, "aa", 2);

        l1.MudarValor(120.00); //muda
        System.out.println(l1.getValor()); //pega mudado
    }

}
