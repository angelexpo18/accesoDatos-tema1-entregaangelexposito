public class Ordenador {
  
  private String codigo;
  private int RAM;
  private String CPU;
  private double precio;
  private String tipoTorre;

  public Ordenador(String codigo, int RAM, String CPU, double precio, String tipoTorre) {
    this.codigo = codigo;
    this.RAM = RAM;
    this.CPU = CPU;
    this.precio = precio;
    this.tipoTorre = tipoTorre;
  }

  public String getCaracteristicas() {
    return "Código: " + codigo + 
      "\nRAM: " + RAM + "GB" + 
      "\nCPU: " + CPU +
      "\nPrecio: " + precio + "€" +
      "\nTipo de torre: " + tipoTorre;
  }

  public String toString() {
    return getCaracteristicas(); 
  }

}