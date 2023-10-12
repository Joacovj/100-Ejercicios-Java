public class Main {
    public static void main(String[] args) {
        Motos moto1 = new Motos(42,50,"Yamaha","ps40");
        Motos moto2 = new Motos(38,4,"Bajaj","Rouser 135ls");
        Motos moto3 = new Motos(49,9,"Corvan","Ldz42");
        Motos moto4 = new Motos(720,140,"Honda","Tornado 42");

        Motos [] motos = {moto1,moto2,moto3,moto4};


        for (Motos moto : motos)
            System.out.println(moto.toString());

    }
}