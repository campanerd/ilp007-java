import java.util.Scanner;
public class Leituras2 {

    public static void main(String args []) {

        Scanner input = new Scanner(System.in);

        String nome;
        int idade;
        double salario;

        System.out.print("Digite seu nome: ");
        nome = input.nextLine();

        System.out.print("Digite sua idade: ");
        idade = input.nextInt();

        System.out.print("Digite seu salário: ");
        salario = input.nextDouble();


        System.out.printf("Dados lidos \n");
        System.out.printf("Nome:  %s\n", nome);
        System.out.printf("Idade: %d\n", idade);
        System.out.printf("Salário: %7.2f\n", salario);
    }
}