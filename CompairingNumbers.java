import java.util.Scanner;
//sorry for the typo in the file name
public class CompairingNumbers {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double first, second;

    System.out.print("Give me two numbers. First: ");
    first = keyboard.nextDouble();
    System.out.print("Second: ");
    second = keyboard.nextDouble();

    if(first < second) {
      System.out.println(first + " is LESS THAN " + second);
    }
    if(first <= second) {
      System.out.println(first + " is LESS THAT/EQUAL TO " + second);
    }
    if(first == second) {
      System.out.println(first + " is EQUAL TO " + second);
    }
    if(first >= second) {
      System.out.println(first + " is GREATER THAN/EQUAL TOO " + second);
    }
    if(first > second) {
      System.out.println(first + " is GREATER THAN " + second);
    }
    if(first != second) {
      System.out.println(first + " is NOT EQUAL TO " + second);
      System.out.println("Hey. ");
    }
  }
}
