package Exercicio2_CA;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Teste {
    public static void main(String[] args) {

        List<Forma> lista = new ArrayList<>();

        Forma retangulo = new Retangulo(20,10);
        Forma retangulo1 = new Retangulo(5,15);
        Forma circulo = new Circulo(2);
        Forma circulo2 = new Circulo(4);
        Forma quadrado = new Quadrado(5);
        lista.add(retangulo);
        lista.add(retangulo1);
        lista.add(circulo);
        lista.add(circulo2);
        lista.add(quadrado);

        for (int i = 0 ; i < lista.size() ; i++){
            Forma geometria = lista.get(i);
            System.out.println(geometria.toString());
        }


    }


}
