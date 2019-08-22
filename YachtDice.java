import static java.lang.System.*;

public class YachtDice {
  public static void main(String[] args) {
    int r1, r2, r3, r4, r5, r6;
    boolean allSame;

    do {
      r1 = 1 + (int)(6*Math.random());
      r2 = 1 + (int)(6*Math.random());
      r3 = 1 + (int)(6*Math.random());
      r4 = 1 + (int)(6*Math.random());
      r5 = 1 + (int)(6*Math.random());
      r6 = 1 + (int)(6*Math.random());
      out.print("\nYou rolled: " + r1 + " " + r2 + " ");
      out.println(r3 + " " + r4 + " " + r5 + " " + r6);
      showDice(r1);
      showDice(r2);
      showDice(r3);
      showDice(r4);
      showDice(r5);
      showDice(r6);
      allSame = (r1 == r2 && r2 == r3 && r3 == r4 && r4 == r5 && r5 == r6);

    }while (! allSame);
    out.println("The Yacht!!");
  }

  public static void showDice(int roll) {
    out.println("+---+");
    if(roll == 1) {
      out.println("|   |");
      out.println("| O |");
      out.println("|   |");
    }
    else if(roll == 2) {
      out.println("|O  |");
      out.println("|   |");
      out.println("|  O|");
    }
    else if(roll == 3) {
      out.println("|O  |");
      out.println("| O |");
      out.println("|  O|");
    }
    else if(roll == 4) {
      out.println("|O O|");
      out.println("|   |");
      out.println("|O O|");
    }
    else if(roll == 5) {
      out.println("|O O|");
      out.println("| O |");
      out.println("|O O|");
    }
    else if(roll == 6) {
      out.println("|O O|");
      out.println("|O O|");
      out.println("|O O|");
    }
    out.println("+---+");
  }
}
