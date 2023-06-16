package Exercicio1_CA;

import java.util.Scanner;

public class Livro extends Produto {
    private  String autor;

    public Livro(String nome, double preco, int codigo, String autor) {
        super(nome, preco, codigo);
        this.autor = autor;
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println("Nome: " + getNome() +" - Preço: " + getPreco() +" - Autor: " + getAutor() + "- Código: " + getCodigo());


    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}

