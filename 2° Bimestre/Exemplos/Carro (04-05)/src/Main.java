public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro ("azul", "hb20", "ABC1020", 2021, new Motor(150, 1.6, 8));

        System.out.println("classificação: "+carro.getMotor().getClassificacao());

        carro.addRoda(new Roda(26, 32)); //vai receber uma roda e adcionar na lista
        carro.addRoda(new Roda(21, 32));
        carro.addRoda(new Roda(22, 32));
        carro.addRoda(new Roda(23, 32));

        for (Roda roda:
             carro.getRoda()) {

            System.out.println("aro: "+roda.getAro());

        }
    }
}
