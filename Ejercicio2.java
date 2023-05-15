public class Ejercicio2 {
    public static void main(String[] args) {

        //convertirlo a int
        char c = 'z';
        int zI = c;
        System.out.println(zI);

        //conviertelo a long y luego de long a short
        int i=250;
        long iL=i;
        System.out.println(iL);
        short iS=(short) i;
        System.out.println(iS);

        //conviertelo a long
        double d=301.067;
        long dL=(long) d;
        System.out.println(dL);

        //súmale 5000.66 y conviertelo a float
        int i4=100;
        double i4D= 5000.66 + i4;
        float t=(float) i4D;
        System.out.println(t);

        //multiplícalo por 100 y conviertelo a byte
        int i5= 737;
        int i6 = i5+100;
        System.out.println(i6);
        byte b= (byte) 16;
        System.out.println(b);

        //divídelo entre 25 y conviertelo a long
        double d1=298.630;
        double d2 = d1/25;
        System.out.println(d2);
        long l =(long) d2;
        System.out.println(l);
    }
}
