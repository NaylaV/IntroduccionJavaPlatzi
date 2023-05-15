//clse 20
public class Casting {
    public static void main(String[] args) {
        //En un año ubique 30 perritos
        //Cuantos perrritos ubique en un mas

        double mothlyDogs=30.0/12.0;
        System.out.println(mothlyDogs);//este no es posible ya que no contamos con medio perrito

        //Estimacion
        int estimateMonthDogs=(int) mothlyDogs;
        System.out.println(estimateMonthDogs);

        //exactitud
        int a=30;
        int b=12;

        System.out.println((double) a/b);

        double c= (double) a/b;
        System.out.println(c);

        char n='1';
        int nI = n;

        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);
    }
}
