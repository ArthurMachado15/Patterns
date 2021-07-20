package Builder;

public class Pessoa {
  private String Cpf;

  private Pessoa() {
  }

  public static Pessoa Build() {
    return new Pessoa();
  }

  public String getCpf() {
    return Cpf;
  }

  public Pessoa setCpf(String cpf) {
    Cpf = cpf;
    return this;
  }
}
