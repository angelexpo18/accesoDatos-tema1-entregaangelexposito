
class Punto3D extends Punto {
  int z;

  public Punto3D(int x, int y, int z) {
    super(x, y);
    this.z = z; 
  }

  @Override
  public double distancia(Punto otroPunto) {
    return Math.sqrt(Math.pow(otroPunto.x - x, 2) + Math.pow(otroPunto.y - y, 2) + Math.pow(z - ((Punto3D)otroPunto).z, 2));
  }

  @Override 
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;

    Punto3D punto3D = (Punto3D) o;

    return z == punto3D.z;
  }
}
