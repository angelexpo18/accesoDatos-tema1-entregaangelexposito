public class Complejo {
    private double dPReal;
    private double dPImag;

    public Complejo() {
    }

    public Complejo(double real, double imag) {
        asignar(real, imag);
    }

    public void asignar(double x, double y) {
        dPReal = x;
        dPImag = y;
    }

    public Complejo sumar(Complejo c1, Complejo c2) {
        Complejo resultado = new Complejo();
        resultado.dPReal = c1.dPReal + c2.dPReal;
        resultado.dPImag = c1.dPImag + c2.dPImag;
        return resultado;
    }

    public void imprimir() {
        System.out.println("Parte Real: " + dPReal);
        System.out.println("Parte Imaginaria: " + dPImag);
    }
}