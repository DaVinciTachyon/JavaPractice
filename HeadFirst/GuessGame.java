public class GuessGame
{
  int playNum = 3;
  Player[] p = new Player[playNum];

  public void startGame()
  {
    int       targetNum;
    int[]     guess     = new int[playNum];
    boolean[] pIsRight  = new boolean[playNum];
    boolean   oRight;

    oRight    = false;
    for(int i = 0; i < playNum; i++)
    {
      p[i]        = new Player();
      guess[i]    = 0;
      pIsRight[i] = false;
    }

    System.out.println("I'm thinking of a number between 0 and 9...\n");

    while(true)
    {
      targetNum = (int) (Math.random() * 10);
      System.out.println("Number to guess is " + targetNum);
      for(int i = 0; i < playNum; i++)
      {
        p[i].guess();
        guess[i] = p[i].num;
        System.out.println("Player " + (i+1) + " guessed " + guess[i]);
        if (guess[i] == targetNum)
        {
          pIsRight[i] = true;
          oRight = true;
        }
      }
      if(oRight)
      {
        System.out.println("We have a winner!");
        for(int i = 0; i < playNum; i++)
        {
          if(pIsRight[i])
          {
            System.out.println("Player " + (i+1) + " got it right.");
          }
        }
        System.out.println("Game Over!");
        break;
      }
      else System.out.println("Players must try again.\n");
    }
  }
}
