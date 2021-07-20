package AbstractFactory;

public class Cliente {
  private String nome;
  private String telefone;
  private String endereco;

  @Override
  public String toString() {
    return "Cliente{" + "nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco + ' ';
  }
}
