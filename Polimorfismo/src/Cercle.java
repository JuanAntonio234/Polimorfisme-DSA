public class Cercle extends Figura {
    public double r;

    public Cercle(double r){
        this.r=r;
    }

    public double area(){return (Math.pow(r,2)*Math.PI);}
}
