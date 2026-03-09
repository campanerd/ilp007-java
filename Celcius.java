import java.util.Scanner;
public class Celcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double c;
        double f;

        System.out.printf("Digite a temp em Celcius:");
        c = input.nextInt();

        f = (c * 9/5) + 32;

        System.out.printf("Está %.1f graus em Fahrenheit", f);

    }
}
