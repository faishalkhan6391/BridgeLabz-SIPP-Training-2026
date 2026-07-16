import java.util.Scanner;

public class BMIFitnessTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input client's weight in kilograms
        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();

        // Input client's height in meters
        System.out.print("Enter height (m): ");
        double height = sc.nextDouble();

        // Calculate BMI using the formula:
        // BMI = weight / (height * height)
        double bmi = weight / (height * height);

        // Display BMI
        System.out.printf("BMI = %.2f%n", bmi);

        // Determine BMI category
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("Category: Normal");
        } else {
            System.out.println("Category: Overweight");
        }

        sc.close();
    }
}