import java.util.Scanner;

public class Caixa {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        double preco;
        double total = 0;
        double desc;

        System.out.println("Suas compras:");
        preco = input.nextDouble();

        while (preco != 0) {
            total += preco;
            preco = input.nextDouble();

        }
        if (total <= 50) {
            desc = total * 0.05;
        } else if (total <= 100) {
            desc = total * 0.10;
        } else if (total <= 200) {
            desc = total * 0.15;
        } else {
            desc = total * 0.20;

        }

        double valorf = total - desc;

        System.out.println("Total: " + total);
        System.out.println("Desconto: " + desc);
        System.out.println("Valor a pagar: " + (valorf));
    }
}