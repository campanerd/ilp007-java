import java.util.Scanner;

public class ContaBancaria {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("N da conta:" );
        n = input.nextInt();

        int soma = 0;
        int conta = n;

        while (n>0){
            int digito = n % 10;
            soma += digito;
            n = n / 10;
        }

        int d = soma % 10;

        System.out.printf("%06d-%d", conta, d);
    }

}
