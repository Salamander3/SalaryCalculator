import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //Adds the Scanner Object
    Scanner scan = new Scanner(System.in);

    //Collects the user's name
    System.out.println("Please enter your name.");
    String name = scan.nextLine();
    System.out.println("Your name is " + name);

    //Collects the user's current amount of money
     System.out.println("Please enter your curent amount of money.");
    Double nowCash = scan.nextDouble();
    System.out.println("Your curent amount of money is " + nowCash);
  }
}