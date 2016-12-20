class HeapQuiz//The aim of the program is to learn about reference variable memory allocation
{
  int id = 0;

  public static void main(Strings[] args)
  {
    //Declarations and Initialisations
    int x,
        i;
    x = 0;
    HeapQuiz[] hq = new HeapQuiz[5];
    while(x < 3)
    {
      hq[x] = new HeapQuiz();
      hq[x].id = x;
      x++;
    }

    //id allocation switching
    hq[3] = hq[1];
    hq[4] = hq[1];
    hq[3] = null;
    hq[4] = hq[0];
    hq[0] = hq[3];
    hq[3] = hq[2];
    hq[2] = hq[0];

    //display results
    for(i = 0; i < 5; i++)
      System.out.println("The id of hq[" + i + "] is " +
        hq[i].id);

    //do stuff
  }
}
