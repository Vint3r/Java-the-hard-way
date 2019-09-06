import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReceiptRevisitedException {
  public static void main(String[] args) {
    PrintWriter fileout;
    Scanner typing = new Scanner(System.in);
    double gall, total, price;
    price = 3.459;

    System.out.println("Fuel costs $" + price + " per gallon");
    System.out.print("How many gallons do you want: ");
    gall = typing.nextDouble();

    total = gall * price;

    System.out.println("Total cost: " + total);
    System.out.println("Printing receipt now.");

    try {
      fileout = new PrintWriter("receipt.txt");
    }
    catch (IOException err) {
      System.out.println("Sorry I can't open 'receipt.txt' for writing");
      System.out.println("Maybe the file exists and is read-only?");
      fileout = null;
      System.exit(1);
    }

    fileout.println("+------------------------+");
    fileout.println("|                        ");
    fileout.println("|      CORNER STORE      ");
    fileout.println("|                        ");
    fileout.println("| 2014-06-25  04:38PM    ");
    fileout.println("|                        ");
    fileout.println("| Gallons:         " + gall + " ");
    fileout.println("| Price/gallon: $ " + price +"  ");
    fileout.println("|                        ");
    fileout.println("| Fuel total:  $ "+ total +"   ");
    fileout.println("|                        ");
    fileout.println("+------------------------+");
    fileout.close();
  }
}
