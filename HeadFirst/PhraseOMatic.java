public class PhraseOMatic
{
  public static void main(String[] args)
  {
		//WordLists
		//wordList1
    String[] wordList1 = {
      "24/7",
      "multi-Tier",
      "30,000 foot",
      "B-to-B",
      "win-win",
      "front-end",
      "web-based",
      "pervasive",
      "smart",
      "six-sigma",
      "critical-path",
      "dynamic"
    };
		//wordList2
    String[] wordList2 = {
      "empowered",
      "sticky",
      "value-added",
      "oriented",
      "centric",
      "distributed",
      "clustered",
      "branded",
      "outside-the-box",
      "positioned",
      "networked",
      "focused",
      "leveraged",
      "aligned",
      "targeted",
      "shared",
      "cooperative",
      "accelerated"
    };
		//wordList3
    String[] wordList3 = {
      "process",
      "tipping-point",
      "solution",
      "architecture",
      "core competency",
      "strategy",
      "mindshare",
      "portal",
      "space",
      "vision",
      "paradigm",
      "mission"
    };

		//Declarations
    int[] length = new int[3];
    int[] rand = new int[3];
    String phrase;
    int i;

		//Initialisations
		//Length of WordLists
    length[0] = wordList1.length;
    length[1] = wordList2.length;
    length[2] = wordList3.length;
		//Genrate Random Number for each list
    for(i = 0; i < 3; i++)
      rand[i] = (int) (Math.random() * length[i]);
		//Generate phrase
    phrase = wordList1[rand[0]] + " " + wordList2[rand[1]] + " " + wordList3[rand[2]];

		//Actions
		//Print phrase
    System.out.println("What we need is a " + phrase);
  }
}
