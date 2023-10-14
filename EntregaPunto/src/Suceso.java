public class Suceso extends Punto3D {
  long tiempo;
  String descripcion;

  public Suceso(int x, int y, int z, long tiempo, String descripcion) {
    super(x, y, z);
    this.tiempo = tiempo;
    this.descripcion = descripcion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;

    Suceso suceso = (Suceso) o;

    if (tiempo != suceso.tiempo) return false;
    return descripcion.equals(suceso.descripcion);
  }
}