public class Portatil extends Ordenador{

  private double peso;

  public Portatil(String codigo, int RAM, String CPU, double precio, double peso) {
    super(codigo, RAM, CPU, precio, "");
    this.peso = peso;
  }

  @Override
  public String getCaracteristicas() {
    String carac = super.getCaracteristicas();
    return carac + "\nPeso: " + peso + "kg";
  }

}