public class Data {
    private int mes;
    private int dia;
    private int ano;

    // Construtor completo
    public Data(int d, int m, int a) {
        setData(d, m, a);
    }

    // Construtor com mês e ano
    public Data(int m, int a) {
        setData(1, m, a);
    }

    // Construtor com apenas ano
    public Data(int a) {
        setData(1, 1, a);
    }

    public void setData(int d, int m, int a) {
        if (m > 0 && m <= 12)
            mes = m;
        else {
            mes = 1;
            System.out.println("Mes " + m + " invalido. Configurando mes = 1.");
        }
        ano = a;
        dia = checkDia(d);
    }

    private int checkDia(int diaTeste) {
        int diasMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Verificação básica de ano bissexto para o mês 2 (fevereiro)
        if (mes == 2 && diaTeste == 29 && (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)))
            return diaTeste;

        if (diaTeste > 0 && diaTeste <= diasMes[mes])
            return diaTeste;

        System.out.println("Dia " + diaTeste + " invalido. Configurado dia = 1.");
        return 1;
    }

    // GETTERS (Necessários para o TesteData funcionar)
    public int getMes() { return mes; }
    public int getAno() { return ano; }
    public int getDia() { return dia; }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}