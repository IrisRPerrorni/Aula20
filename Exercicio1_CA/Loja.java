package Exercicio1_CA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {
    public static void buscarProduto(String nome, List<Produto> lista) {
        int posicao = -1;

        for (int i = 0; i < lista.size(); i++) {
            if (nome == lista.get(i).getNome()) {
                posicao = i;
                break;
            }
        }

        if (posicao == -1){
            System.out.println(" O Nome " + nome + " não encontrado!");

        }else{
            System.out.println("O nome: " + nome + "\nEsta na posição: " + posicao);

        }

    }


    public static void main(String[] args) {
        List<Produto> listaProduto = new ArrayList<>();
        Produto livroA = new Livro("Harry Potter", 30.0, 1245, "Jk");
        Produto cdA = new Cds("Falção", 10.0, 5248, 10);
        Produto dvd = new Dvds("Flashback", 20.0, 5689, 3.0);
        Produto livroB = new Livro("Teoria das estruturas", 100.00, 25896, "Duarte");
        Produto cdB = new Cds("Rappa", 50.0, 1896, 6);
        listaProduto.add(livroA);
        listaProduto.add(cdA);
        listaProduto.add(dvd);
        listaProduto.add(livroB);
        listaProduto.add(cdB);

        for (int i = 0; i < listaProduto.size(); i++) {
            Produto produto = listaProduto.get(i);
            produto.mostrarDetalhesDoItem();

        }
        System.out.println("\n___________testando codigos_________");

        List<Produto> listaProduto2 = new ArrayList<>();

        Produto livro01 = new Livro("Harry Potter", 30.58 , 1245,"JC" );
        Produto livro02 = new Livro("Estudando métodos" , 90.0 , 5248 , "Caroline Lopes ");
        Produto cd01 = new Cds("Pop" , 20.85 , 1588 , 10);
        Produto dvd01 = new Dvds("Hello" , 50.0 , 1598 , 5.0);

        listaProduto2.add(livro01);
        listaProduto2.add(livro02);
        listaProduto2.add(cd01);
        listaProduto2.add(dvd01);

        for (Produto teste:listaProduto2) {

            System.out.println("O nome: " + listaProduto.get(0).getNome() +" e " + teste.getNome() + " os codigos são = " + teste.equals(listaProduto.get(0)));

        }

        System.out.println("\n__________buscando produto_______________");
        buscarProduto("Harry Potter", listaProduto);
        buscarProduto("iris", listaProduto);


    }
}






