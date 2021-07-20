package AbstractFactory;

public class FactoryAluguelChique extends FactoryAluguel {
  @Override
  public Cliente selecionarCliente() {
    return new PessoaJuridica();
  }

  @Override
  public Carro selecionarCarro() {
    return new CarroChique();
  }
}
