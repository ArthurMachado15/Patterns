package AbstractFactory;

public class PessoaJuridica extends Cliente {
  private String cnpj;
  private String funcionario;

  @Override
  public String toString() {
    return super.toString() + " PessoaJuridica{" + "cnpj=" + cnpj + ", funcionario=" + funcionario + "}}";
  }

}