import java.util.Scanner;

class Main
{
  private static int num;

  public static void main(String[] args)
  {
    Game game = new Game();

    intro();

    if(num > 0)
      game.startGame(num);
  }

  public static void intro()
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Here is the math game.");

    do
    {
      System.out.print("How many questions would you like to answer?\n\t");
      num = input.nextInt();

      if(num > 1)
        System.out.println("I will ask you " + num + " questions to which to must give the correct answer.");
      else if(num == 1)
        System.out.println("I will ask you a question to which to must give the correct answer.");
      else if(num == 0)
        System.out.println("Up to you.\n");
      else
        System.out.println("That won't work.\n");
    } while(num < 0);
  }
}
