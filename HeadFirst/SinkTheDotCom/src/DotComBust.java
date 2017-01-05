import java.util.*;
public class DotComBust//Main class for the game
{

  public static void main(String[] args)//MAin function allowing to set up and start the game
  {
    DotComBust game = new DotComBust();
    game.setUpGame();
    game.startPlaying();
  }

  private GameHelper helper = new GameHelper();                     //Have the helper functions helper
  private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();  //Create an ArrayList to house the Dot Coms
  private int numGuesses = 0;                                       //Number of guesses

  private void setUpGame()//Set up the game
  {
    int i;
    //Create the DotComs
    DotCom[] DotComs = new DotCom[3];
    for(i = 0; i < 3; i++)
      DotComs[i] = new DotCom();

    //Name all of the Dot Coms
    DotComs[0].setName("Pets");
    DotComs[1].setName("Go2");
    DotComs[2].setName("eToys");
    //Add the Dot Coms to their Array List
    for(i = 0; i < 3; i++)
      dotComsList.add(DotComs[i]);

    //Place the DotComs on the grid
    for(DotCom dotComToSet : dotComsList)
      dotComToSet.setLocationCells(helper.placeDotCom(3));

    //Give instructions to the player
    System.out.println("Your goal is to sink the three dot coms.\nPets.com, eToys.com, Go2.com\nTry to sink them in the fewest nember of guesses.");
  }

  private void startPlaying()//Play the game
  {
    String userGuess;               //The user's guess
    while(!dotComsList.isEmpty())   //While the Array List containing the Dot Coms is not empty continue
      UserGuess();                  //Let the user guess and check if it is correct
    finishGame();                   //End the game
  }

  private void UserGuess()//Allow the user to guess
  {
    String  userGuess,  //The user's guess
            result;     //Holds the result of whether a Dot Com has been hit

    numGuesses++;                                     //Increase the number of guesses
    result = "miss";                                  //Set the default result
    userGuess = helper.getUserInput("Enter a Guess"); //Find the user's guess

    for(DotCom dotComToTest : dotComsList)
    {
      result = dotComToTest.checkYourself(userGuess); //Check whether the guess has resulted in a hit
      if (result.equals("hit"))
        break;
      if (result.equals("kill"))
      {
        dotComsList.remove(dotComToTest); //Remove the hit Dot com from the array
        break;
      }
    }
    System.out.println(result);
  }

  private void finishGame()//end the game
  {
    System.out.println("All of the dot coms are dead! Your stock is now worthless"); //The game is finished
    if(numGuesses < 18) //Positive message for less than 18 guesses
      System.out.println("It only took you " + numGuesses + " guesses.\n\tYou got out before you sank.");
    else                  //Negative message for 18 guesses or more
      System.out.println("Took you long enough. " + numGuesses + " guesses.\n\tFish are dancing with your options.");
  }
}
