public class Main {
    public static void main(String[] args) {
        double [] numeros = new double[6];
        for (int i = 0; i< numeros.length; i++){
            numeros[i] = Math.random() * 100;
        }

        System.out.println(obtenerMayor(numeros));
    }

    public static double obtenerMayor (double [] numeros){
        double mayor = numeros[0];
        for (double numero : numeros){
            if (numero > mayor)
                mayor = numero;
        }

        return mayor;
    }
}