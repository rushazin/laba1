import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.*;


public class laba1 {

    public static void main(String[] args) {

        long[] w = new long[7];
        for (int i = 0, j = 6; i < w.length; i++, j += 2) {
            w[i] = j;
        }

        double[] x = new double[13];
        Random random = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = (random.nextDouble() * 21 - 15);
        }

        double[][] q = new double[7][13];
        for (int i = 0; i < q.length; i++) {
            for (int j = 0; j < q[i].length; j++) {
                q[i][j] = count(w[i], x[j]);
            }
        }

        for (double[] row : q) {
            for (double l : row) {
                if(Double.isNaN(l)){
                    System.out.print(l + "     ");
                }
                else{
                    System.out.printf("%.5f", l);
                    System.out.print("\t");
                }
            }
            System.out.print("\n");
        }
    }

    public static double count(long w, double x) {
        if (w == 10) {
            return pow((0.25 / (pow((((3. - (1. / 3.)) / (x + PI)) / (pow(E, x))), 3))),
                    (atan(pow(((x - 4.5) / 21.), 2.))));
        }
        if (w == 6 | w == 8 | w == 16) {
            return pow(E, (cos((1. / 4) / x)));
        } else {
            return sin(cos(pow(E, atan((x - 4.5) / 21.))));
        }
    }
}



