package Exercicio2_CA;

public class Quadrado extends Retangulo {


    public Quadrado(float lado) {
        super(lado);
    }

    @Override
    public String toString() {
        return "Quadrado" +
                "\narea: " + this.calcularArea() +
                "\nperimetro: " + this.calcularPerimetro();
    }
}
