public class Rectangulo extends Figura {

    public double l1;
    public double l2;

    public Rectangulo(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }
    @Override
    public double area() {
        return l1*l2;
    }
}
