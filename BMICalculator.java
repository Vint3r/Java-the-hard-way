import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, inch, lbs, ft, in;

    System.out.print("Your height (feet only): ");
    ft = keyboard.nextDouble();

    System.out.print("Your height (inches): ");
    in = keyboard.nextDouble();

    System.out.print("Your weight in pounds: ");
    lbs = keyboard.nextDouble();

    inch = ft * 12 + in;
    m = inch / 39.3701;
    kg = lbs / 2.20462;

    bmi = kg / (m*m);

    System.out.println("Your BMI is " + bmi);
  }
}
