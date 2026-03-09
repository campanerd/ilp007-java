import java.util.Scanner;
public class Absoluto {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double n;

        System.out.print("Digite um numero:");
        n = input.nextDouble();

        if (n<0)
            n = -n;

        else System.out.printf("modulo de n: %f", n);
        input.close();
    }
}
