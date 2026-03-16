import java.util.Scanner;

public class Maiorn {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int maior = 0;

        System.out.println("Digite: ");
        n = input.nextInt();

        while (n!=0){
            n = input.nextInt();
            if (maior<n){
                maior = n;
            }
        }
        System.out.printf("é: " +maior);
    }
}
