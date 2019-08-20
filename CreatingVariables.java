public class CreatingVariables {
  public static void main(String[] args) {
    int x, y, age, numOfDogs;
    double seconds, e, checking, pi;
    String firstName, lastName, title, dogName, dogBreed;

    numOfDogs = 3;
    x = 10;
    y = 400;
    age = 39;

    pi = 3.1415;
    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;

    dogName = "Canis";
    dogBreed = "Huskey";
    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";

    System.out.println("The variable x contains " + x);
    System.out.println("The value " + y + " is stored in the variable y.");
    System.out.println("The experiment took " + seconds + " seconds.");
    System.out.println("A favorite irrational # is Euler's number: " + e);
    System.out.println("Hopefully you have more than $" + checking + "!");
    System.out.println("My name's " + title + " " + firstName + lastName);
    System.out.println("My favorite irrational # if you can all it that is pi: " + pi);
    System.out.println("I live in a house with " + numOfDogs + " dogs.");
    System.out.println("My dogs name is " + dogName + ", she is a " + dogBreed + ".");
  }
}
