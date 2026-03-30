public class TesteCalculadora{
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // somar(int, int)
        System.out.println(calc.somar(2, 3));
        // somar(int, int, int)
        System.out.println(calc.somar(2, 3, 4));
        // somar(double, double)
        System.out.println(calc.somar(2.5, 3.5));
        // somar(int, double)
        System.out.println(calc.somar(2, 3.5));
    }
}

