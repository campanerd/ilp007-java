package HerdandoVeiculo;

import ClasseVeiculo.Veiculo;

public class TesteCarro {

    public static void main(String args[] ){

        Veiculo v = new Veiculo ("Toyota Etios", "EQB1785", 2024, 65000);
        v.imprime();
        v.deprecia(10);

        System.out.println("\nCarro depreciado:");
        v.imprime();

    }

}
