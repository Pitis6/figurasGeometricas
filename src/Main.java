public class Main {
    public static void main(String[] args) {

        Cuadrado cuadrado = new Cubo(2);
        Cubo cubo = new Cubo(2);
        //Cubo cubo1 = new Cuadrado(2);

        System.out.println(cuadrado.getArea());
        System.out.println(cubo.getArea());
    }
}