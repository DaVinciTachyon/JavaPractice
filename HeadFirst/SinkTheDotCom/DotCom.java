import java.util.ArrayList;
public class DotCom
//Creates and manages the DotCom
{
  //Declare instance variables
  private ArrayList<String> locationCells;
  private int numOfHits = 0;//Counter is initialised to 0
  private int sizeDotCom;
  private int lengthBoard;
  private String name;

  //Set the name of the DotCom
  public void setName(String s)
  {
    name = s;
  }

  //Set the size of the DotCom
  public void setSizeDotCom(int s)
  {
    if(s > 0)
      sizeDotCom = s;
    else if(s == 0)
      sizeDotCom = 1;
    else
      sizeDotCom = -1 * s;
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
    sizeDotCom = s;
    setLocationCells();
  }
  //If the size of the DotCom has already been decided
  public void setLocationCells()
  {
    int randomNum,
        i;
    randomNum = (int) (Math.random() * (lengthBoard - sizeDotCom + 1));
    for(i = 0; i < size; i++)
      locationCells.add((String)/*Parse to string, better way*/(randomNum + i));
  }

  public String checkYourself(String stringGuess)
  {
    int guess,
        cell,
        index;
    String result;

    result = "miss";
    index = locationCells.indexOf(stringGuess);

    if(index >= 0)
    {
      locationCells.remove(index);
      if(locationCells.isEmpty())
        result = "kill";
      else
        result = "hit";
    }

    System.out.println(result);
    return result;
  }
}
