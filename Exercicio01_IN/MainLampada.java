package Exercicio01_IN;

import java.util.Scanner;

public class MainLampada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        FabricaDeLampadas fabrica = new FabricaDeLampadas();

        System.out.println("Qual tipo de lampada você deseja construir? (Incadescente ou Flourescente");

        String opcao = entrada.next();

        Lampada lampada = fabrica.construir(opcao);

        System.out.println("Digite a opção que você deseja");
        System.out.println("1 - Ligar a lâmpada");
        System.out.println("2 - Desligar a lâmpada");
        int resp = entrada.nextInt();

        switch (resp) {
            case 1:
                lampada.ligar();
                break;
            case 2:
                lampada.desligar();
            default:
                System.out.println("Opção Invalida!");

        }


    }

}
