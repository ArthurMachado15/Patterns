package Singleton;

public class Singleton {
    private static Singleton instanciaSingle;

    private Singleton() {
    }

    public static Singleton PegaInstancia() {
        if (instanciaSingle == null) {
            instanciaSingle = new Singleton();
        }
        return instanciaSingle;
    }

    public void DestroiInstancia() {
        instanciaSingle = null;
    }
}
