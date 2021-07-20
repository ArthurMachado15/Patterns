package Adapter;

public class Main {
    public static void main(String[] args) {
        iPessoa Fisica = new PessoaFisica();
        Fisica.setNome("Arthur");

        iPessoa Juridica = new PessoaJuridica();
        Juridica.setNome("GOOGLE");

        // ADAPTER, UMA MESMA INTERFACE PARA CLASSES DIFERENTES UTILIZANDO DE UM MESMO
        // METODO
    }
}
