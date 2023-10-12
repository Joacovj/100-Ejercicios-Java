public class Main {
    public static void main(String[] args){
        for (char i = 'a'; i<='z'; i++){
            int ascci = i;
            System.out.print(i + ": " + ascci + ", ");
        }

        System.out.println("\n");

        for (char i = 'z'; i>='a'; i--){
            int ascci = i;
            System.out.print(i + ": " + ascci + ", ");
        }
    }
}