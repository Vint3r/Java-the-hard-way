import java.util.Scanner;

public class WeaselOrNot {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String word;
    boolean yep, nope;

    System.out.println("Type the word \"weasel\", please.");
    word = keyboard.next();

    yep = "weasel".equals(word);
    nope = ! word.equals("weasel");
    // still works with "weasel" in front of the dot and the variable in the parens

    System.out.println("You typed what was requested: " + yep);
    System.out.println("You ignored the polite instructions: " + nope);
  }
}
