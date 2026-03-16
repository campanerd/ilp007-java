import java.util.Scanner;

public class Mediaval {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        double n, med;
        double soma = 0;
        int qnt = 0;

        System.out.println("Digite o valor: ");
        n = input.nextDouble();

        while (n!=0){
            soma += n;
            qnt ++;
            n = input.nextDouble();
        }

        med = soma / qnt;

        System.out.printf("Quantidade: " + qnt);
        System.out.printf("Soma: " + soma);
        System.out.printf("Media: " + med);

    }
}
