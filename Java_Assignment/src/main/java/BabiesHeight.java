import java.util.Arrays;
import java.util.Scanner;

public class BabiesHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] HeightList = new double[10];

        System.out.println("Enter height of 10 babies in CM:");
        for (int i = 0; i < HeightList.length; i++) {
            System.out.println("Baby " + (i + 1) + " height");
            HeightList[i] = scanner.nextDouble();
        }

        double min1 = Double.MAX_VALUE;
        Double min2 = Double.MAX_VALUE;

        for (double h : HeightList) {
            if (h < min1) {
                min2 = min1;
                min1 = h;
            } else if (h < min2 && h != min1) {
                min2 = h;
            }
        }
        System.out.println("\nTwo lowest baby heights are:");
        System.out.println("1st lowest: " + min1 + "cm");
        System.out.println("2nd lowest: " + min2 + "cm");
    }
}
