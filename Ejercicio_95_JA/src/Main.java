public class Main {
    public final static int INITIAL_SIZE = 10;
    public final static int FACTOR_CRECIMIENTO = 2;
    public static void main(String[] args) {
        int [] arreglo = new int[INITIAL_SIZE];
        int contador = 0;

        for (int i=0; i< arreglo.length; i++){
            arreglo[i] = i;
            contador++;
        }

        for (int i=10; i<=40; i++){
            if (contador >= arreglo.length){
                arreglo = redimensionarArreglo(arreglo);
            }
            contador++;

            arreglo[i] = i;
        }

        for (int numero:
             arreglo) {
            System.out.println(numero);
        }

    }

    /**
     * Redimensiona un arreglo de enteros
     * @param arreglo Arreglo a dimensionar
     * @return Nuevo arreglo redimensionado
     */

    public static int[] redimensionarArreglo (int [] arreglo){
        int [] nuevoArreglo = new int[arreglo.length * FACTOR_CRECIMIENTO];
        System.arraycopy(arreglo, 0, nuevoArreglo, 0,  arreglo.length);

        return nuevoArreglo;
    }
}