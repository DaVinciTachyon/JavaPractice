class Shuffle1
{

  public static void main(String[] args)
  {
    
    //Declaration
    int x;

    //Initialisation
    x = 3;

    //Actions
    while(x > 0)
    {

      if(x > 2)
        System.out.print("a");

      x--;
      System.out.print("-");

      if(x == 2)
        System.out.print("b c");

      if(x == 1)
      {
        System.out.print("d");
        x--;
      }//end of if(x == 1)

    }//end of while loop

  }//end of main funtion

}//end of class Shuffle1
