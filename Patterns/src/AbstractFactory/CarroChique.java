package AbstractFactory;

public class CarroChique extends Carro {
  private Integer codSeguro;
  private Boolean blindado;

  @Override
  public String toString() {
    return super.toString() + " CarroLuxo{" + "codSeguro=" + codSeguro + ", blindado=" + blindado + "}}";
  }

}
