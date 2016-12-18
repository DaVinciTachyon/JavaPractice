class DrumKit
{

  //Initialisations and Declarations of class variables
  boolean topHat = true;
  boolean snare = true;

  void playSnare()
  {
    System.out.println("bang bang ba-bang");
  }//end of playSnare function

  void playTopHat()
  {
    System.out.println("ding ding da-ding");
  }//end of playTopHat function

}//end of class DrumKit

class DrumKitTest
{

  public static void main(String[] args)
  {

    //Initialisations
    DrumKit d = new DrumKit();

    //Declarations
    d.snare = false;

    //Actions
    d.playSnare();

    if(d.snare == true)
      d.playSnare();

    d.playTopHat();

  }//end of main function

}//end of class DrumKitTest
