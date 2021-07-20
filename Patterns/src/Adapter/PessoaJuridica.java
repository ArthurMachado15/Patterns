package Adapter;

public class PessoaJuridica implements iPessoa {
  private String nome;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
