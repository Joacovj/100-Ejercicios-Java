public class Main {
    public static void main(String[] args) {
        int num = 1031;
        System.out.println("El numero " + num + " es capicua?: " + esCapicua(num));
    }

    public static boolean esCapicua (int num){
        String sNum = String.valueOf(num);

        for (int i=0, j = sNum.length() -1; i<=j; i++, j--){
            if (sNum.charAt(i) != sNum.charAt(j)){
                return false;
            }
        }

        return true;
    }
}