import java.util.Scanner;

public class Inverso2 {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        // Variável declarada fora do bloco de repetição
        int n;

        do {
            System.out.println("Digite um numero natural:");
            n = entrada.nextInt();
        } while (n < 0);

        do {
            System.out.print(n % 10);
            n = n / 10;
        } while (n != 0);

    }
}