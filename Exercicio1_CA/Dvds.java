package Exercicio1_CA;

public class Dvds extends Produto {
    private double duracao;

    public Dvds(String nome, double preco, int codigo, double duracao) {
        super(nome, preco, codigo);
        this.duracao = duracao;
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println("Nome: " + getNome() +" - Preço: " + getPreco() +" - Duração: " + getDuracao() + " - Codigo: " + getCodigo());

    }

    public double getDuracao() {

        return duracao;
    }

    public void setDuracao(double duracao) {

        this.duracao = duracao;
    }
}
