package Decorator;

public class Main {

    public static void main(String[] args) {

        IDecorator MinhaClasse = new DecoratorImplements();
        System.out.println("Valor 1 - " + MinhaClasse.Decorate());

        IDecorator MinhaClasse2 = new DecoratorValueTwo(MinhaClasse);
        System.out.println("\n" + "Valor 2 - " + MinhaClasse2.Decorate());

    }
}
