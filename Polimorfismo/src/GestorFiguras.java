
public class GestorFiguras {
    public static double suma(Figura[] v){
        double suma = 0;
        for (Figura f : v)
            suma+=f.area();
        return suma;
    }
    private static void sort(Figura[] v) {
        for (int i =0;i < v.length-1;i++){
            int j=i;
            for(int k=i+1;k<v.length;k++){
                if(v[k].area()<v[j].area()){
                    j=k;
                }
            }
            Figura temp =v[i];
            v[i]=v[j];
            v[j]=temp;
        }

        for (Figura f:v)
            System.out.println(f.area());
    }
    public static void main(String[] args) {
        Figura[] v = new Figura[4];

        v[0] = new Rectangulo(5, 3);
        v[1] = new Cercle(5);
        v[2] = new Cuadrado(5);
        v[3] = new TriangleEQ(120,8);

        double res = suma(v);
        System.out.println("suma: " + res);
        //print(v);

        sort(v);  //  print(v);
    }
}
