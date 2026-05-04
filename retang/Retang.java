package retang;

public class Retang {

    private double base;
    private double altura;


    public Retang() {
        this.base = 2;
        this.altura = 1;
    }

    public Retang(double base, double altura) {
        this.base = base;
        this.altura = altura;
        System.out.println();
    }



    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getArea() {
        return base * altura;
    }

    public double getPerimetro() {
        return (base * 2) + (altura * 2);
    }

    public boolean isQuadrado() {
        return base == altura;
    }

    public void imprimirInfo() {
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + getArea());
        System.out.println("Perímetro: " + getPerimetro());
        System.out.println("É quadrado? " + isQuadrado());
    }
}