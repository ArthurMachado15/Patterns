package Adapter;

public class PessoaFisica implements iPessoa {
  private String nome;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
