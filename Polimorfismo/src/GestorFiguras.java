
public class GestorFiguras {
    public static double suma(Figura[] v){
        double suma = 0;
        for (Figura f : v)
            suma+=f.area();
        return suma;
    }
    public static void main(String[] args) {
        Figura[] v = new Figura[2];

        v[0] = new Rectangulo(5, 3);
        // v[1] = new Cercle(5);
        v[1] = new Cuadrado(5);
        //v[3] = new Cercle(120);

        double res = suma(v);
        System.out.println("suma: " + res);
        //print(v);    sort(v);    //print(v);
    }
}
