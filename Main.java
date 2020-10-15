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
    Double preCash = scan.nextDouble();
    System.out.println("Your curent amount of money is " + preCash);

    //Collects how many weeks that they want to calculate
    System.out.println("How many weeks into the future do you want to calculate.");
    int weeks = scan.nextInt();
    System.out.println(name + " want to calculate " + weeks + " weeks in the future.");

    //Collects how much you make per week
    System.out.println("How much you make per week.");
    Double salary = scan.nextDouble();
    System.out.println(name + " make $" + salary + " per week.");

    //Loop to make the program do it's job
    int nowWeeks = 0;
    double nowCash = 0;
    if(salary >= 0 && weeks >= 0 || weeks >= nowWeeks) //Makes sure you didnt put a negative value for weeks or salary.
    {
      while(nowWeeks != weeks)
      {
        System.out.println("Week " + (nowWeeks + 1));
        nowCash = preCash + salary * (nowWeeks + 1);
        System.out.println(name + " will make $" + nowCash + ".");
        System.out.println();
        nowWeeks++;
      }
    }
    if(salary <= 0 || weeks <=0)//super fun secret if you put a negative number for salary or weeks.
    {
      System.out.println("!ERROR!");
      scan.nextLine();
      System.out.println("!Self Destruct Sequence Activated!");
      scan.nextLine();
      while(0 == 0)
      {
        System.out.print("█");
      }
    }
    else;
    {
      System.out.println("Calculation Complete!");
      //The extra println is so there is more space between this and the final result.
      System.out.println();
      System.out.println();
    }
    //Prints the final result
    for(int done = 0; done != 1; done++)
    {
      System.out.println(name + " will make $" + nowCash + " in " + weeks + " weeks.");
    }
  }
}