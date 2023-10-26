public class Complejo {
    private double real;
    private double imaginaria;

    public Complejo(){}

    public Complejo(double real, double imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginaria() {
        return imaginaria;
    }

    public void setImaginaria(double imaginaria) {
        this.imaginaria = imaginaria;
    }

    public Complejo sumar(Complejo otroComplejo){
        Complejo complejo = new Complejo();

        double nuevoReal = this.real + otroComplejo.getReal();
        double nuevoImaginaria = this.imaginaria + otroComplejo.getImaginaria();

        complejo.setReal(nuevoReal);
        complejo.setImaginaria(nuevoImaginaria);

        return complejo;
    }

    public Complejo restar(Complejo otroComplejo){
        Complejo complejo = new Complejo();

        double nuevoReal = this.real - otroComplejo.getReal();
        double nuevoImaginaria = this.imaginaria - otroComplejo.getImaginaria();

        complejo.setReal(nuevoReal);
        complejo.setImaginaria(nuevoImaginaria);

        return complejo;
    }

    public Complejo multriplicar(Complejo otroComplejo){
        Complejo complejo = new Complejo();

        double nuevoReal = this.real * otroComplejo.getReal() -
                this.getImaginaria() * otroComplejo.getImaginaria();
        double nuevaImaginaria = this.real * otroComplejo.getImaginaria() +
                this.getImaginaria() * otroComplejo.getReal();

        complejo.setReal(nuevoReal);
        complejo.setImaginaria(nuevaImaginaria);

        return complejo;
    }

    public Complejo dividir(Complejo otroComplejo){
        Complejo complejo = new Complejo();

        double nuevoReal = (this.real * otroComplejo.getReal() +
                this.imaginaria * otroComplejo.getImaginaria()) /
                (otroComplejo.getReal() * otroComplejo.getReal() +
                 otroComplejo.getImaginaria() * otroComplejo.getImaginaria());

        double nuevaImaginaria = (this.imaginaria * otroComplejo.getReal() -
                this.real * otroComplejo.getImaginaria()) /
                (otroComplejo.getReal() * otroComplejo.getReal() +
                        otroComplejo.getImaginaria() * otroComplejo.getImaginaria());

        complejo.setReal(nuevoReal);
        complejo.setImaginaria(nuevaImaginaria);

        return complejo;
    }

    @Override
    public String toString() {
        return "Complejo{" +
                "real=" + real +
                ", imaginaria=" + imaginaria +
                '}';
    }
}
