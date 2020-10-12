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

    //Collects how many weeks that they want to calculate
    System.out.println("How many weeks into the future do you want to calculate.");
    int weeks = scan.nextInt();
    System.out.println("You want to calculate " + weeks + " weeks in the future.");

    //Collects how much you make per week
    System.out.println("How much you make per week.");
    Double salary = scan.nextDouble();
    System.out.println("you make $" + salary + " per week.");

    //Loop
    int nowWeeks = 0;
    if(salary >= 0 && weeks >= 0 && weeks >= nowWeeks)
    {
      while(nowWeeks != weeks)
      {
      System.out.println("Week " + (nowWeeks + 1));
      nowWeeks++;
      }
    }
    else;
    {
      System.out.println("Done");
    }
  }
}