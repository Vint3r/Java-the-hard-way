import java.util.Scanner;

public class EnterPIN {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String pass, entry2;

    pass = "Sniffles";
    pin = 12345;

    System.out.println("Password: ");
    entry2 = keyboard.next();

    while(! entry2.equals("Sniffles")) {
      System.out.println("\nIncorrect password, please try agin.");
      System.out.print("Password: ");
      entry2 = keyboard.next();
    }

    System.out.println("Welcome to the bank of Java.");
    System.out.print("Enter your PIN: ");
    entry = keyboard.nextInt();

    while(entry != pin) {
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.print("Enter your PIN: ");
      entry = keyboard.nextInt();
    }
    System.out.println("\nPIN accepted. Your account balance is $425.17");
  }
}
