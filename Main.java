import java.util.Scanner;

class Cal {
  public static void main(String[] args) {
    //Adds the Scanner Object
    Scanner scan = new Scanner(System.in);

    //Collects the user's name
    System.out.println("Please enter your name.");
    String name = scan.nextLine();
    System.out.println("Your name is " + name);
  }
}