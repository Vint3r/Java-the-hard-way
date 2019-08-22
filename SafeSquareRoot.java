import java.util.Scanner;

public class SafeSquareRoot {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String call, response;

    call = "yes";

    System.out.println("Are you ready?!?" );
    response = keyboard.next();

    while(! response.equals(call)) {
      System.out.println("I said are you ready?!?");
      System.out.print("Just type 'yes' when you are ready to go!\n");
      response = keyboard.next();
    }

    System.out.print("Give me a number, and I'll find it's square root.");
    System.out.print("(No negatives, please.)");
    x = keyboard.nextDouble();

    while(x < 0) {
      System.out.println("I won't take the square root of a negative.");
      System.out.print("\nNew number: ");
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println("The square root of " + x + " is " + y);
  }
}
