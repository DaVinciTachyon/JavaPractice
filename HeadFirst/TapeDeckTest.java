class TapeDeck
{

  //Initialisations and Declarations of class variables
  boolean canRecord = false;

  void playTape()
  {
    System.out.println("tape playing");
  }//end of playTape function

  void recordTape()
  {
    System.out.println("tape recording");
  }//end of recordTape function

}//end of class TapeDeck

class TapeDeckTest
{

  public static void main(String[] args)
  {

    //Initialisations
    TapeDeck t = new TapeDeck();

    //Declarations
    t.canRecord = true;

    //Actions
    t.playTape();

    if(t.canRecord == true)
      t.recordTape();

  }//end of main function

}//end of class TapeDeckTest
