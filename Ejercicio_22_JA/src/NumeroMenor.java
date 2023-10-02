public class NumeroMenor {
    public static double devolverMenor (double [] numero){
        double menor = numero[0];

        for (double numeros : numero){
            if (menor > numeros)
                menor = numeros;
        }
        return menor;
    }
}
