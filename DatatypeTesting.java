import java.util.Scanner;

public class DatatypeTesting
{
  public static void main(String[] args) 
  {
    String name = "";
    int age = 0;
    boolean hasGuild = false;
    long inGameMoney = 0L;
    double strength = 0;

    Scanner input = new Scanner(System.in);
    System.out.print("Who are you? ");
    name = input.nextLine();
    System.out.print("How old are you? ");
    age = input.nextInt();
    System.out.print("Do you want to join our guild? ");
    hasGuild = input.nextBoolean();
    System.out.print("How many balance do you have in your bank account? ");
    inGameMoney = input.nextLong();
    System.out.print("Enter you strength ");
    strength = input.nextDouble();

    input.close();
  }
}