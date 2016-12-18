class DVDPlayer
{

  //Initialisations and Declarations of class variables
  boolean canRecord = false;

  void playDVD()
  {
    System.out.println("DVD playing");
  }//end of playDVD function

  void recordDVD()
  {
    System.out.println("DVD recording");
  }//end of recordDVD function

}//end of class DVDPlayer

class DVDPlayerTest
{

  public static void main(String[] args)
  {

    //Initialisations
    DVDPlayer d = new DVDPlayer();

    //Declarations
    d.canRecord = true;

    //Actions
    d.playDVD();

    if(d.canRecord == true)
      d.recordDVD();

  }//end of main function

}//end of class DVDPlayerTest
