import java.util.Scanner;
public class Fatorial {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);
        int n, i, f = 1;

        do {
            System.out.println("Digite um numero n >= 0:");
            n = entrada.nextInt();
        } while (n < 0);

        for (i = n; i > 0; i--)
            f = f * i;

        System.out.println("Fatorial: " + f);
    }
}