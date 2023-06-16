package Exercicio1_CA;

public class Cds extends Produto {
    private int numeroDeFaixas;


    public Cds(String nome, double preco, int codigo, int numeroDeFaixas) {
        super(nome, preco, codigo);
        this.numeroDeFaixas = numeroDeFaixas;
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println("Nome: " + getNome() +" - Preço: " + getPreco() +" - Numero de Faixa: " + getNumeroDeFaixas() + " - Código: " + getCodigo());


    }

    public int getNumeroDeFaixas() {
        return numeroDeFaixas;
    }

    public void setNumeroDeFaixas(int numeroDeFaixas) {
        this.numeroDeFaixas = numeroDeFaixas;
    }
}
