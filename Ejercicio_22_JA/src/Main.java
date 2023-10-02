public class Main {
    public static void main(String[] args) {
        double [] numeros = new double[6];
        for (int i=0; i< numeros.length; i++){
            numeros [i] =  Math.random() * 100;
        }

        double menor = NumeroMenor.devolverMenor(numeros);
        System.out.println(menor);

    }


}