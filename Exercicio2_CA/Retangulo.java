package Exercicio2_CA;

public class Retangulo extends Forma {
    private float lado;
    private float altura;

    public Retangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public Retangulo(float lado) {
        this.lado = lado;
        this.altura = lado;
    }

    @Override
    public double calcularArea() {
        return (getAltura() * getLado());
    }

    @Override
    public double calcularPerimetro() {
        return ((2 * getAltura()) + (2 * getLado()));
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {

        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Retangulo" +
                "\narea: " + this.calcularArea() +
                "\nperimetro: " + this.calcularPerimetro();
    }
}
