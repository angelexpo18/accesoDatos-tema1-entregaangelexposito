public class ComplejoTest {
    public static void main(String[] args) {
        Complejo c1 = new Complejo(3.0, 4.0);
        Complejo c2 = new Complejo(1.5, 2.5);

        Complejo resultado = new Complejo();
        resultado = resultado.sumar(c1, c2);

        System.out.println("Complejo 1:");
        c1.imprimir();

        System.out.println("Complejo 2:");
        c2.imprimir();

        System.out.println("Resultado de la suma:");
        resultado.imprimir();
    }
}