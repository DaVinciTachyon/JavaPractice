import java.io.*;
public class GameHelper
//Create a class that allows inputs to be taken
{
  public String getUserInput(String prompt)//gets user's input
  {
    //Declarations
    String inputLine;
    BufferedReader is = new BufferedReader(new InputStreamReader(System.in));

    //Initialisation
    inputLine = null;

    //PRompt the user
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
      System.out.println("IOExcpetion: " + e);
    }
    //Return the input
    return inputLine;
  }
}
