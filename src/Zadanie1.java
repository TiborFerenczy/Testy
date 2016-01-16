
public class Zadanie1 {

    public static double[] rownanieKwatratowe(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                return null;
            } else {
                double[] tab = new double[1];
                tab[0] = -c / b;
                return tab;
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                return null;
            } else if (delta == 0) {
                double[] tab = new double[1];
                tab[0] = -b / (2 * a);
                return tab;
            } else {
                double[] tab = new double[2];
                tab[0] = (-b - Math.pow(delta, 1 / 2)) / (2 * a);
                tab[1] = (-b + Math.pow(delta, 1 / 2)) / (2 * a);

                return tab;
            }

        }
    }
}
