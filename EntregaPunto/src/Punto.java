public class Punto {
  int x;
  int y;

  public Punto(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Punto() {
    this(0, 0);
  }

  public double distancia(Punto otroPunto) {
    return Math.sqrt(Math.pow(otroPunto.x - x, 2) + Math.pow(otroPunto.y - y, 2));
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Punto punto = (Punto) o;

    if (x != punto.x) return false;
    return y == punto.y;
  }
}