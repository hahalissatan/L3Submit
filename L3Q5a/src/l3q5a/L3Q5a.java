package l3q5a;

import java.util.Scanner;

public class L3Q5a {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("""
                Crammer's rule:
                    ax + by = e, cx + dy = f
                    x = (ed - bf) / (ad - bc)
                    y = (af - ec) / (ad - bc)
                """);
            double[] val = new double[6];
            for (int i = 0; i < 6; i++) {
                System.out.printf("Enter the value of %c : ", i + 'a');
                val[i] = sc.nextDouble();
            }
            double a = val[0], b = val[1], c = val[2], d = val[3], e = val[4], f = val[5];
            double denominator = a * d - b * c;
            if (denominator < 0.000000001) { //e-9 threshold equivalent to 0
                System.out.println("no solution");
            } else {
                System.out.printf("x = %.2f, y = %.2f%n",
                    (e * d - b * f) / denominator,
                    (a * f - e * c) / denominator
                );
            }
        }
    }
}