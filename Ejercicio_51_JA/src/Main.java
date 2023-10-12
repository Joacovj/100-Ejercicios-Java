import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add an integer number: ");

        int number = sc.nextInt();
        String aNumber = String.valueOf(number);
        int length = aNumber.length();

        System.out.println("The number has: " + length + " digits");

    }
}