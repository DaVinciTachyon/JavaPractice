public class SimpleDotCom
//Creates and manages the DotCom
{
  //Declare instance variables
  private int[] locationCells;
  private int numOfHits = 0;//Counter is initialised to 0
  private int sizeDotCom;
  private int lengthBoard;

  //Set the size of the DotCom
  public void setSizeDotCom(int s)
  {
    sizeDotCom = s;
  }

  //Set the size of the DotCom
  public void setLengthBoard(int s)
  {
    lengthBoard = s;
  }

  //Get the locations of the DotCom
  //If the size of the DotCom is yet to be determined
  public void setLocationCells(int s)
  {
    int randomNum,
        i;
    sizeDotCom = s;
    randomNum = (int) (Math.random() * (lengthBoard - size + 1));
    for(i = 0; i < size; i++)
      locationCells[i] = randomNum + i;
  }
  //If the size of the DotCom has already been decided
  public void setLocationCells()
  {
    int randomNum,
        i;
    randomNum = (int) (Math.random() * (lengthBoard - size + 1));
    for(i = 0; i < size; i++)
      locationCells[i] = randomNum + i;
  }

  public String checkYourself(String stringGuess)
  {
    int guess,
        cell;
    String result;

    guess = Integer.parseInt(stringGuess);
    result = "miss";

    for(cell : locationCells)
    {
      if(guess == cell)
      {
        result = "hit";
        numofHits++;
        break;
      }
    }
    if(numOfHits == locationCells.length)
    {
      result = "kill";
    }
    System.out.println(result);
    return result;
  }
}
