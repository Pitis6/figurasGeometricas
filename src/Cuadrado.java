public class Cuadrado extends FigurasGeometricas {
    protected  double valor1;

    public Cuadrado(double valor1) {
        super(valor1);
    }

    public double getArea(){
        return Math.pow(this.valor1,2);
    }

    @Override
    public double getPerimetro() {
        return this.valor1*4;
    }
}
