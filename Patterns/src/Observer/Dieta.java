package Observer;

import java.util.ArrayList;
import java.util.List;

public class Dieta implements Observable {
  private List<Observer> observers = new ArrayList<Observer>();
  private double peso;

  public Dieta(double peso) {
    this.peso = peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
    this.notifyObservers();
  }

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (Observer ob : observers) {
      System.out.println("Notificando observers!");
      ob.update(this.peso);
    }
  }
}
