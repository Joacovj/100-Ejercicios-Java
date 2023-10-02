import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double [][] matriz = new double[3][3];
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

            for (int i=0; i< matriz.length; i++){
                for (int j=0; j< matriz.length; j++){
                    if (flag == true)
                        System.out.println("Coloque un numero positivo: ");

                    try {
                        matriz[i][j] = sc.nextDouble();
                        while (matriz[i][j] <=0){
                            System.out.println("Debe introducir un numero positivo: ");
                            matriz[i][j] = sc.nextDouble();

                        }
                        flag = true;

                    }catch (InputMismatchException e){
                        String bad_input = sc.next();
                        System.out.println("Ha introducido: " +"\"" + bad_input + "\"" + " \nDebe introducir un numero positivo: ");
                        flag = false;
                        j--;
                    }
                }
            }

        for (int i=0; i< matriz.length; i++){
            System.out.println();
            for (int j=0; j< matriz.length; j++){
                System.out.print(matriz[i][j] + "\t" + "\t");
            }
        }
    }
}