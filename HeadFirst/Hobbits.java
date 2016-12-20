class Hobbits //Name and display for Hobbits
{
  String name;

  public static void main(String[] args)
  {
    //Declarations
    Hobbits[] h = new Hobbits[3];
    int z;

    //Initialisations
    z = 0;

    while(z < 3)
    {
      h[z] = new Hobbits();
      h[z].name = "Bilbo";

      if(z==1)
        h[z].name = "Frodo";

      if(z==2)
        h[z].name = "Sam";

      System.out.println(h[z].name + " is a good hobbit name.");

      z++;
    }//end of while loop

  }//end of main function
}//end of class Hobbits
