package Facade;

public class ComputadorFacade {
  private Cpu cpu;
  private Memoria memoria;
  private HardDrive hardDrive;

  public ComputadorFacade(Cpu cpu, Memoria memoria, HardDrive hardDrive) {
    this.cpu = cpu;
    this.memoria = memoria;
    this.hardDrive = hardDrive;
  }

  public void ligarComputador() {
    cpu.start();
    cpu.execute();

  }
}