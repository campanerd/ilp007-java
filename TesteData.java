public class TesteData {
    public static void main(String args[]) {
        Data data1, data2, data3;

        data1 = new Data(30, 03, 2026);
        data2 = new Data(2024);        // Chama o construtor de 1 parâmetro (ano)
        data3 = new Data(06, 2028);    // Chama o construtor de 2 parâmetros (mes, ano)

        System.out.println("Hoje é " + data1.toString());
        System.out.println("Ingressei no segundo semestre de " + data2.getAno());
        System.out.println("Me formarei em " + data3.getMes() + "/" + data3.getAno());
    }
}