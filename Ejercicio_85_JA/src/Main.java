public class Main {
    public static void main(String[] args) {
        Complejo c1 = new Complejo(2,3);
        Complejo c2 = new Complejo(-3,5);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("Suma: " + c1.sumar(c2));
        System.out.println("Resta: " + c1.restar(c2));
        System.out.println("Multiplicacion: " + c1.multriplicar(c2));
        System.out.println("Division: " + c1.dividir(c2));

    }
}