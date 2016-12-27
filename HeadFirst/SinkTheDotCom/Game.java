public class Game
{
  public static void main(String[] args)
  {
    //Declarations
    boolean       isAlive;
    SimpleDotCom  theDotCom;
    GameHelper    helper;
    int           numGuesses;
    int[]         locations = new int[3];
    String        userGuess,
                  result,
                  testResult;

    //Initialisations
    numGuesses  = 0;
    isAlive     = true;
    helper      = new GameHelper();
    theDotCom   = new SimpleDotCom();

    //Setting up the location of the DotCom
    theDotCom.setLengthBoard(7);
    theDotCom.setLocationCells(3);

    while(isAlive)
    {
      userGuess = helper.getUserInput("Enter a Number");
      result = theDotCom.checkYourself(userGuess);
      numGuesses++;

      if(result.equals("kill"))
      {
        isAlive = false;
        System.out.println("You took " + numGuesses + " guesses");
      }
    }
  }
}
