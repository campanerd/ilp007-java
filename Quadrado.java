import java.util.Scanner;
public class Quadrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int soma = 0;
        int impar = 1;

        System.out.println("Digite um número:");
        n = input.nextInt();

        for (int i = 0; i < n; i++){
            soma += impar;
            impar += 2;
        }

        System.out.printf("Quadrado é:" + soma);
    }
}
