class Echo
{

  //Initialisations and Declarations of class variables
  int count = 0;

  void hello()
  {
    System.out.println("helloooo...");
  }//end of hello function

}//end of class Echo

class EchoTest
{

  public static void main(String[] args)
  {

    //Initialisations
    Echo[] e = new Echo[2];
    int x;

    //Declarations
    x = 0;

    //Actions
    while(x < 4)
    {

      e[0].hello();
      e[0].count++;

      if(x == 3)
        e[1].count++;

      if(x > 0)
        e[1].count += e[0].count;

      x++;

    }//end of while loop

    System.out.println(e[1].count);

  }//end of main function

}//end of class EchoTest
