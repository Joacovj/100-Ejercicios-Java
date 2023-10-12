public class Motos {
    int motor;
    int capacidadCombustible;
    String marca;
    String modelo;

    public Motos(int motor, int capacidadCombustible, String marca, String modelo) {
        this.motor = motor;
        this.capacidadCombustible = capacidadCombustible;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return  "motor=" + motor +
                ", capacidadCombustible=" + capacidadCombustible +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'';
    }
}
