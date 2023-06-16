package Exercicio01_IN;

public class LampadaFluorescente implements Lampada {

    @Override
    public void ligar() {
        System.out.println("Ligar");
    }

    @Override
    public void desligar() {
        System.out.println("desligar");

    }
}
