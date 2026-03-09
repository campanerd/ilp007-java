import java.util.Scanner;
public class Dolar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double real;
        double dolar;

        System.out.printf("Digite o valor em real:");
        real = input.nextDouble();

        dolar = real * 5;

        System.out.printf("Você tem %.2f dolares", dolar);

    }
}

