package AbstractFactory;

public class Aluguel {
  Cliente cliente;
  Carro carro;

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public Carro getCarro() {
    return carro;
  }

  public void setCarro(Carro carro) {
    this.carro = carro;
  }

  @Override
  public String toString() {
    return "Aluguel{" + "cliente=" + cliente + ", carro=" + carro + '}';
  }
}
