import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char [] arr = new char[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca 10 caracteres: ");

        for (int i=0; i< arr.length; i++){
            arr[i] = sc.next().charAt(0);
        }

        for (int i=0; i< arr.length; i++){
            for (int j = arr.length -1 ; j > i; j--){
                if (arr[i] == arr[j]){
                    arr[j] = ' ';
                }
            }
            System.out.print(arr[i] + ", ");
        }
    }
}
