public class Main {
    // e a classe principal pra testes
    public static class Principal {

        public static void main(String[] args) {

            Carro[] c1 = new Carro[3];
            Motor[] m1 = new Motor[3];
            Pneus[] p1 = new Pneus[3];

            m1[0] = new Motor(300, "2.0", "500", "v8");

            p1[0] = new Pneus("Pirelli", "Misto");

            c1[0] = new Carro("Ferrari", "Vermelha", 300, m1[0], p1[0]);

            c1[0].showStatusCarro();
        }
    }
}
