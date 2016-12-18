public class PhraseOMatic
{
  public static void main(String[] args)
  {
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
    int[] length = new int[3];
    int[] rand = new int[3];
    String phrase;
    int i;

    length[0] = wordList1.length;
    length[1] = wordList2.length;
    length[2] = wordList3.length;
    for(i = 0; i < 3; i++)
      rand[i] = (int) (Math.random() * length[i]);
    phrase = wordList1[rand[0]] + " " + wordList2[rand[1]] + " " + wordList3[rand[2]];

    System.out.println("What we need is a " + phrase);
  }
}
