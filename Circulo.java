public class Circulo {

    //atributo privado
    private double raio;

    //metodo construtor
    public Circulo (double r){
        setRaio(r);
    }

    //metodo alterar raio
    public void setRaio(double r)
    {
        if (r < 0)
            System.out.println("O raio nao poode ser negativo.");
        else
            raio = r;
    }

    //metodo informar raio
    public double getRaio() {
        return raio;
    }

    //metodo exibir dados
    public void exibeDados(){
        System.out.println("Raio: " + getRaio());
    }
}