import java.util.Scanner;

public class CountingFor {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int n;
    String message;

    System.out.println("Enter a message and I'll display it five times.");
    System.out.print("Message: ");
    message = keyboard.nextLine();

    for (n = 1; n <= 5; n++) {
      System.out.println(n + ". " + message);
    }

    System.out.println("\nNow I'll show it ten times and count by 5s.");
    for (n = 5; n <= 50; n += 5) {
      System.out.println(n + ". " + message);
    }

    System.out.println("\nFinally, three times counting backward.");
    for (n = 3; n > 0; n -= 1) {
      System.out.println(n + ". " + message);
      // n is still set to equal 55 from the last for loop and uses that as a starting point.
    }
  }
}
