public class Rectangulo extends FigurasGeometricas{
    private double valor2;
    public Rectangulo(double valor1, double valor2) {
        super(valor1);
        this.valor2 = valor2;
    }

    @Override
    public double getArea() {
        return this.valor2*this.valor1;
    }

    @Override
    public double getPerimetro() {
        return 2*this.valor2+2*this.valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
}
