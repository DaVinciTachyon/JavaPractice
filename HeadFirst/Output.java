class Output//Used to test the reader's compiling ability through asking for the compiled result
{

  public static void main(String[] args)
  {
    //Create and output object
    Output o = new Output();
    //Start the go function
    o.go();
  }

  void go()
  {
    //Declarations
    int y,
        x;

    //Initialisation
    y = 7;
    //For Loop
    for(x = 1; x < 8; x++)
    {
      y++;
      if(x > 4)
        System.out.print(++y + " ");
      if(y > 14)
      {
        System.out.println(" x = " + x);
        break;
      }
    }//end of for loop
  }//end of go function
}//end of class
