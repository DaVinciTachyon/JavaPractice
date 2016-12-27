import java.io.*;
import java.util.*;
public class GameHelper
//Create a class that allows inputs to be taken
{
  private static final String alphabet = "abcdefg";
  private int gridLength = 7;
  private int gridSize = 49;
  private int[] grid = new int[gridSize];
  private int comCount = 0;

  public void setGridLength(int s)
  {
    gridLength = s;
    setGridSize();
  }
  public void setAlphabet(String s)
  {
    alphabet = s;
    setGridSize();
  }
  private void setGridSize()
  {
    gridSize = alphabet.length() * gridLength;
  }

  public ArrayList<String> placeDotCom(int comSize)
  {
    ArrayList<String> alphaCells;
    String temp;
    int[] coords;
    int attempts,
        location,
        incr,
        x,
        row,
        column;
    boolean success;

    alphaCells = new ArrayList<String>();
    temp = null;
    coords = new int[comSize];
    attempts = 0;
    success = false;
    location = 0;
    incr = 1;
    row = 0;
    column = 0;
    comCount++;

    if(comCount % 2 == 1)
      incr = gridLength;

    while(!success & attempts++ < 200)
    {
      location = (int) (Math.random() * gridSize);
      x = 0;
      success = true;
      while(success && x < comSize)
      {
        if(grid[location] == 0)
        {
          coords[x++] = location;
          location += incr;
          if(location >= gridSize)
            success = false;
          if(x > 0 && (location % gridLength == 0))
            success = false;
          else
            success = false;
        }
      }
      x = 0;
      while(x < comSize)
      {
        grid[coords[x]] = 1;
        row = (int) (coords[x] / gridLength);
        column = coords[x] % gridLength;
        temp = String.valueOf(alphabet.charAt(column));
        alphaCells.add(temp.comcat(Integer.toString(row)));
        x++;
        //System.out.print("Coord " + x + " = " + alphaCells.get(x-1));
      }
      return alphaCells;
    }
  }

  public String getUserInput(String prompt)//gets user's input
  {
    //Declarations
    String inputLine;
    BufferedReader is = new BufferedReader(new InputStreamReader(System.in));

    //Initialisation
    inputLine = null;

    //Prompt the user
    System.out.print(prompt + ": ");
    //Read the line
    try
    {
      inputLine = is.readLine();
      if(inputLine.length() == 0)
        return null;
    }
    //Handle an exception
    catch (IOException e)
    {
      System.out.println("IOException: " + e);
    }
    //Return the input
    return inputLine.toLowerCase();
  }
}
