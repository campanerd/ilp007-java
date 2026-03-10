import java.util.Scanner;
public class Inverso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero natural");
        int n = entrada.nextInt();

        while (n!=0){
            System.out.print(n % 10);
            n = n/10;
        }
    }
}