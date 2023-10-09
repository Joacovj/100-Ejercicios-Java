public class Main {
    public static void main(String[] args) {

//        for (int i =0 ; i< 100; i++){
//            double numero1 = Math.random();
//            System.out.println(numero1);
//        }

        for (int i =0 ; i< 100; i++){
            double numero2 = Math.random() * 7.01;

            while (numero2 == 6){
                numero2 = Math.random() * 7.01;
            }
            System.out.println(numero2);
        }
//
        for (int i =0 ; i< 100; i++){
            double numero3 = Math.random() * 11;
            System.out.println(numero3);
        }


    }
}