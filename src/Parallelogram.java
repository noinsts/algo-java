import java.util.Arrays;
import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] ll = new double[4];

        for (int i = 0; i < 4; i++) {
            ll[i] = sc.nextDouble();
        }

        Arrays.sort(ll);

        if (ll[0] == ll[1] && ll[2] == ll[3]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
