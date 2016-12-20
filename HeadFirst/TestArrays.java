class TestArrays//Code Magnets Exercise helping teach the assignment of primitive and reference variables
{
  public static void main(String[] args)
  {
    //Declarations
    int y;
    int[] index = new int[4];
    String[] islands = new String[4];

    //Initialisations
    y = 0;
    //Island names
    islands[0] = "Bermuda";
    islands[1] = "Fiji";
    islands[2] = "Azores";
    islands[3] = "Cozumel";
    //Index values
    index[0] = 1;
    index[1] = 3;
    index[2] = 0;
    index[3] = 2;

    //Print the island names
    while(y < 4)
    {
      System.out.println("island = " + islands[index[y]]);
      y++;
    }//end of while loop
  }//end of main function
}//end of class TestArrays
