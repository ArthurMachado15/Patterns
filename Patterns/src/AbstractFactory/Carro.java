package AbstractFactory;

public class Carro {
  private Integer cod;
  private String placa;
  private String fabricante;
  private String modelo;

  @Override
  public String toString() {
    return "Carro{" + "cod=" + cod + ", placa=" + placa + ", fabricante=" + fabricante + ", modelo=" + modelo;
  }

}
