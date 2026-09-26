import java.util.*;

public class BMICalculator {

    static String getBmiStatus(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of people: ");
        int n = sc.nextInt();

        double[] height = new double[n];
        double[] weight = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Height (m): ");
            height[i] = sc.nextDouble();

            System.out.print("Weight (kg): ");
            weight[i] = sc.nextDouble();
        }

        System.out.println("\nPerson\tBMI\tStatus");

        for (int i = 0; i < n; i++) {
            double bmi = weight[i] / (height[i] * height[i]);

            System.out.printf("%d\t%.2f\t%s\n",
                    i + 1, bmi, getBmiStatus(bmi));
        }
    }
}