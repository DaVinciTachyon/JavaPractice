import java.util.*;
public class DotComBust
{

  public static void main(String[] args)
  {
    DotComBust game = new DotComBust();
    game.setUpGame();
    game.startPlaying();
  }

  private GameHelper helper = new GameHelper();
  private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
  private int numGuesses = 0;

  private void setUpGame()
  {
    int n = 3;
    DotCom[] DotComs = new DotCom[n];
    ArrayList<String> newLocation;
    for(int i = 0; i < n; i++)
      DotComs[i] = new DotCom();

    DotComs[0].setName("Pets");
    DotComs[1].setName("Go2");
    DotComs[2].setName("eToys");
    for(i = 0; i < n; i++)
      dotComsList.add(DotComs[i]);

    System.out.println("Your goal is to sink the three dot coms.\nPets.com, eToys.com, Go2.com\nTry to sink them in the fewest nember of guesses.");
    for(DotCom dotComToSet : dotComsList)
    {
      newLocation = helper.placeDotCom(3);
      dotComToSet.setLocationCells(newLocation);
    }
  }

  private void startPlaying()
  {
    String userGuess;
    while(!dotComsList.isEmpty())
    {
      userGuess = helper.getUserInput("Enter a Guess");
      checkUserGuess(userGuess);
    }
    finishGame();
  }

  private void checkUserGuess(String userGuess)
  {
    String result;
    numGuesses++;
    result = "miss";
    for(DotCom dotComToTest : dotComsList)
    {
      result = dotComToTest.checkYourself(UserGuess);
      if (result.equals("hit"))
        break;
      if (result.equals("kill"))
      {
        dotComsList.remove(dotComToTest);
        break;
      }
    }
    System.out.println(result);
  }

  private void finishGame()
  {
    System.out.println("All of the dot coms are dead! Your stock is nuw worthless");
    if(numOfGuesses <= 18)
      System.out.println("It only took you " + numOfGuesses + " guesses.\n\tYou got out before you sank.");
    else
      System.out.println("Took you long enough. " + numOfGuesses + " guesses.\n\tFish are dancing with your options.");
  }
}
