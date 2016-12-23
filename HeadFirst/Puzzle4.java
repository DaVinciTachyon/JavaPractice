public class Puzzle4//Pool Puzzle for learning to recognize how to compile code
{
  public static void main(String[] args)
  {
    //Declarations
    int y,
        x,
        result;

    //Initialisations
    x = 0;
    result = 0;
    y = 1;

    //Calculate some numbers
    while(x < 6)
    {
      obs[x] = new Puzzle4b();
      obs[x].ivar = y;
      y *= 10;
      x++;
    }

    //Add some numbers to the result
    while(x > 0)
    {
      x--;
      result += obs[x].doStuff(x);
    }

    //Show them some results
    System.out.println("result: " + result);

  }//end of main function
}//end of class Puzzle4

class Puzzle4b//Allows the incrementation of the result
{
  int ivar;

  public int doStuff(int factor)//Returns completed operations for incrementing the result
  {
    if(ivar > 100)
      return ivar * factor;
    else
      return ivar * (5 - factor);
  }//end of doStuff function

}//end of class Puzzle4b
