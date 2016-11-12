public class BeerSong
{
  public static void main(String[] args)
  {
    //Declarations
    int beerNum;
    String word;

    //Initialisations
    beerNum = 99;
    word = "bottles";

    //Song
    while (beerNum > 0)
    {
      System.out.println(beerNum + " " +
        word + " of beer on the wall.");
      System.out.println(beerNum + " " +
        word + " of beer.");
      System.out.println("Take one down.");
      System.out.println("Pass it around.");
      beerNum--;
      if (beerNum == 1) word = "bottle";
      if (beerNum > 0) System.out.println(beerNum + " " +
        word + " of beer on the wall.\n");
      else System.out.println("No more bottles of beer on the wall.\n");
    }
  }
}
