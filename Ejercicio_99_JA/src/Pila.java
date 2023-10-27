public class Pila<T> {
    public final static int INITIAL_SIZE = 10;
    private T[] elementos;
    int contador;

    public Pila() {
        this(INITIAL_SIZE);
    }

    public Pila(int tamanio){
        if (tamanio>0){
            elementos = (T[]) new Object[tamanio];
        } else {
            elementos = (T[]) new Object[INITIAL_SIZE];
        }
        contador = 0;
    }

    public boolean estaVacia(){
        return contador == 0;
    }

    public void insertar(T elemento){
        elementos[contador] = elemento;
        contador++;
    }

    public void sacar(){
        if (contador == 0){

        }
        else {
            contador--;
            elementos[contador] = null;
        }
    }

    public void mostrarElementos (){
        for (T elemento: elementos){
            System.out.println(elemento);
        }
    }



}
