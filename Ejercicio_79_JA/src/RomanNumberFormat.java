public class RomanNumberFormat {
    static int[] valores = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    static String[] letrasRomanas = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    static StringBuilder romano = new StringBuilder();

    public static String format (int num){

        for(int i=0;i<valores.length;i++)
        {
            while(num >= valores[i])
            {
                num = num - valores[i];
                romano.append(letrasRomanas[i]);
            }
        }

        return romano.toString();
    }
}
