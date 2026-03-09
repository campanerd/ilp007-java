import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p1, p2, m;

        System.out.print("Digite as duas notas: ");
        p1 = input.nextDouble();
        p2 =  input.nextDouble();
        m = (p1+p2)/2;

        if (m >= 6)
            System.out.printf("voce foi aprovado com a nota %.2f de media", m);

        else if (m >= 4)
            System.out.printf("rec com media %.2f", m);

            else
                System.out.printf("voce foi reprovado com a nota %.2f de media", m);

        input.close();
    }
}
