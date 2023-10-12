public class Main {
    public static void main(String[] args) {
        int [] calificaciones = {1,10,10,7,9,6,7,8,4,8,9,9};
        int repeticion = 0;

        for (int i=0; i< calificaciones.length; i++){
            for (int j=0; j< calificaciones.length; j++){
                if (i == j){

                }
                else {
                    if (calificaciones[i] == calificaciones[j])
                        repeticion++;
                }
            }
            if (repeticion != 0)
                repeticion++;

            System.out.println("La calificacion " + calificaciones[i] + " se repite " + repeticion + " veces");
            repeticion =0;
        }
    }
}