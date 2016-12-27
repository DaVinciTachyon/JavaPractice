import java.util.ArrayList;
public class DotCom
//Creates and manages the DotCom
{
  //Declare instance variables
  private ArrayList<String> locationCells;
  private String name = "Default.com";

  //Set the name of the DotCom
  public void setName(String domainName)
  {
    name = domainName.concat(".com");
  }

  //Get the locations of the DotCom
  public void setLocationCells(int n)
  {
    locationCells = helper.placeDotCom(n);
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
