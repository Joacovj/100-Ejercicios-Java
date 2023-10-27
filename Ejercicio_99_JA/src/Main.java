public class Main {
    public static void main(String[] args) {
        Pila<Integer> numeros = new Pila<>();

        numeros.insertar(1);
        numeros.insertar(2);
        numeros.insertar(3);
        numeros.insertar(4);
        numeros.insertar(5);
        numeros.mostrarElementos();

        numeros.sacar();
        numeros.sacar();
        numeros.mostrarElementos();

    }
}