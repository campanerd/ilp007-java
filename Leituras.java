import java.util.Scanner;
public class Leituras {

    public static void main(String args []) {

        Scanner input = new Scanner(System.in);
        
        String nome;
        int idade;

        System.out.print("Digite seu nome: ");
        nome = input.nextLine();

        System.out.print("Digite sua idade: ");
        idade = input.nextInt();

        System.out.printf("Dados lidos: \nNome: %s\nIdade: %d", nome, idade);
    }
}