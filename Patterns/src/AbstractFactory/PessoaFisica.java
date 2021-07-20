package AbstractFactory;

public class PessoaFisica extends Cliente {
  private String cpf;

  @Override
  public String toString() {
    return super.toString() + " PessoaFisica{" + "cpf=" + cpf + "}}";
  }

}