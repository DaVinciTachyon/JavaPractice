class PoolPuzzle1
{

  public static void main(String[] args)
  {

    //Declarations
    int x;

    //Initialisations
    x = 0;

    //Actions
    while(x < 4)
    {

      System.out.print("a");

      if(x < 1)
        System.out.print(" ");

      System.out.print("n");

      if(x > 1)
      {
        System.out.print("oyster");
        x += 2;
      }

      if(x == 1)
        System.out.print("noys");

      if(x < 1)
        System.out.print("oise");

      System.out.println("");
      x++;

    }//end of while loop

  }//end of main function

}//end of class PoolPuzzle1
