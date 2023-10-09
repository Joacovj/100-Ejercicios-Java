public class Main {
    public static void main(String[] args) {
        String [] palabra = {"o","c","t","o","r","r","i","n","o"};

        for (int i=0; i< palabra.length; i++){
            int randm = (int) Math.round(Math.random() * palabra.length);
            while (randm >= palabra.length){
                randm = (int) Math.round(Math.random() * palabra.length);
            }
            System.out.println("El caracter de la palabra en la posicion: " + randm + " es " + palabra[randm]);
        }
    }
}