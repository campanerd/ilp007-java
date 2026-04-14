package retang;

public class TesteRetang {
        public static void main(String[] args) {
            Retang r1 = new Retang();
            Retang r2 = new Retang(4, 4);

            r1.imprimirInfo();
            System.out.println("--------");
            r2.imprimirInfo();
        }
    }
