import java.util.Scanner;

public class RudeQuestions {
  public static void main(String[] args) {
    String name, favAnimal;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Hello. What is your name?");
    name = keyboard.next();

    System.out.print("Hi, " + name + "! How old are you?");
    age = keyboard.nextInt();
    //will blow up here if you put a fractional number or 'string' because int can't hold those values

    System.out.println("So you're " + age + ", eh? That's not very old.");
    System.out.print("How much do you weigh, " + name + "?");
    weight = keyboard.nextDouble();
    //will blow up here if you answer with a string because double can't hold them

    System.out.println(weight + "! Better keep that quiet!!");
    System.out.print("Finally, whats your income, " + name + "?");
    income = keyboard.nextDouble();
    //will blow up here if you answer with a string because double can't hold them, same as the reason above

    System.out.print("Hopefully that is " + income + " per hour");
    System.out.println(" and not per year!");

    System.out.print("Hey, I got a good question for you, whats your favorite animal?");
    favAnimal = keyboard.next();
    System.out.println(favAnimal + ", huh? Yeah those are pretty cool.");
    System.out.print("Well, thanks for answering my rude questions, ");
    System.out.println(name + ".");
    /* The code doesn't blow up putting an int value into a double variable
    because double can hold both whole and fractional numbers.
    It also doesn't blow up when you give it a number when it is asking for a String
    because strings can hold both numbers (of any kind) and words or letters.*/
  }
}
