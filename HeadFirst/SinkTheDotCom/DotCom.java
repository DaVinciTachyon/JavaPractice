import java.util.ArrayList;
public class DotCom
//Creates and manages the DotCom
{
  //Declare instance variables
  private ArrayList<String> locationCells;
  private String name;

  //Set the name of the DotCom
  public void setName(String domainName)
  {
    name = domainName + ".com";
  }

  //Get the locations of the DotCom
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
