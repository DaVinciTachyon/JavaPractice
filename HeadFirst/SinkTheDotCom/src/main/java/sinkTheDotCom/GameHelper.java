import java.io.*;
import java.util.*;
public class GameHelper
//Takes pre-made and allows the use of not yet covered concepts to be merged into the SinkTheDotCom code
{
  private String alphabet = "abcdefg"; //Creates the first ordinate of a location on the grid
  private int gridLength = 7;                       //Creates the second ordinate
  private int gridSize = 49;                        //The overall number of squares in the grid
  private int[] grid = new int[gridSize];           //array of the grid
  private int comCount = 0;

  public void setAlphabet(String s)//Allows change of the number of first ordinates
  {
    alphabet = s;
    setGridSize();
  }
  public void setGridLength(int s)//Allows change of the number of second ordinates
  {
    gridLength = s;
    setGridSize();
  }
  private void setGridSize()//Changes the grid size based on number of ordinate changes
  {
    gridSize = alphabet.length() * gridLength;
  }

  public ArrayList<String> placeDotCom(int comSize/*The length of the Dot Com*/)//Places a DotCom on the grid so that it does not intefere with any other and is fully on the grid
  {
    //Declarations
    ArrayList<String> alphaCells; //An array list containing the DotCom position
    String temp;                  //Used for temporary storage of column values
    int[] coords;                 //Used of temporary storage of locations
    int attempts, 	              //Makes sure the program does not go on for too long, allowing it to quit after n tries
        location,                 //Allows the finding of the initial block of the Dot Com
        incr,                     //The increment of the next block of the Dot Com from the previous, allows the vertical and horizontal placement of a Dot Com
        x,                        //Counter
        row,                      //Second ordinate
        column;                   //First ordinate
    boolean success;              //Determines the usability of a square

    //Initialisations
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

    if(comCount % 2 == 1)//Choose whether the Dot Com is horizontal or vertical
      incr = gridLength;//Change the increment to the correct amount for the orientation

    while(!success & attempts++ < 200)//WHile unsuccessful or there have been 200 attempts
    {
      //Test initialisations
      location = (int) (Math.random() * (gridSize - comSize + 1));//Choose an arbitrary location as the starting point of the Dot Com
      x = 0;
      success = true;
      while(success && x < comSize)//While within bounds and has access to free space, and the Dot Com is not completely placed
      {
        if(grid[location] == 0)//If unoccupied
        {
          coords[x++] = location;   //set one of the squares of the Dot Com
          location += incr;         //Increment to reach next position
          if(location >= gridSize)  //If within the end of the grid
            success = false;
          if(x > 0 && (location % gridLength == 0)) //If not coming of the right hand side
            success = false;
        }
        else
          success = false;
      }
      for(x = 0; x < comSize; x++)//Set the working coordinates into an ArrayList to return
      {
        grid[coords[x]] = 1;
        row = (int) (coords[x] / gridLength);
        column = coords[x] % gridLength;
        temp = String.valueOf(alphabet.charAt(column));
        alphaCells.add(temp.concat(Integer.toString(row)));
        //System.out.print("Coord " + (x - 1) + " = " + alphaCells.get(x) + "\n");
      }
    }
    return alphaCells;
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
