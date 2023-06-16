package Exercicio2_CA;

public class Circulo extends Forma {
    private double pi = 3.14;
    private double raio;

    public Circulo(double raio) {

        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return (pi * (getRaio() * getRaio()));
    }

    @Override
    public double calcularPerimetro() {
        return (2 * pi * getRaio());
    }

    public double getRaio() {

        return raio;
    }

    public void setRaio(double raio) {

        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo" +
                "\narea: " + this.calcularArea() +
                "\nperimetro: " + this.calcularPerimetro();
    }
}
