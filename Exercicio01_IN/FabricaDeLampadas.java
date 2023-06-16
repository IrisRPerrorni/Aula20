package Exercicio01_IN;

public class FabricaDeLampadas {


    public Lampada construir (String opcao){
        if (opcao.equalsIgnoreCase("incadescente")){
            return new LampadaIncadescente();
        } else if (opcao.equalsIgnoreCase("fluorescente")){
            return new LampadaFluorescente();
        }else {
            throw new IllegalArgumentException("opção invalida");
        }
    }


}
