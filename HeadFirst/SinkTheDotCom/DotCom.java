import java.util.ArrayList;
public class DotCom
//Creates and manages the DotCom
{
  //Declare instance variables
  private ArrayList<String> locationCells;
  private int sizeDotCom;
  //private int lengthBoard;
  private String name;

  //Set the name of the DotCom
  public void setName(String domainName)
  {
    name = domainName + ".com";
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
  /*public void setLengthBoard(int s)
  {
    lengthBoard = s;
  }*/

  //Get the locations of the DotCom
  //If the size of the DotCom is yet to be determined
  public void setLocationCells(int s, ArrayList<String> loc)
  {
    sizeDotCom = s;
    setLocationCells(loc);
  }
  //If the size of the DotCom has already been decided
  public void setLocationCells(ArrayList<String> loc)
  {
    locationCells = loc;
  }

  public String checkYourself(String stringGuess)
  {
    int index;
    String result;

    result = "miss";
    index = locationCells.indexOf(stringGuess);

    if(index >= 0)
    {
      locationCells.remove(index);
      if(locationCells.isEmpty())
      {
        result = "kill";
        System.out.println("Ouch you sunk " + name + " :(");
      }
      else
        result = "hit";
    }
    return result;
  }
}
