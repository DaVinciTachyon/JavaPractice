import java.io.*;
import java.util.*;

class Game
{
  private double sum;
  private double ans;

  void startGame(int num)
  {
    double t;
    int questionN,
        timer,
        correct;

    Display showUs = new Display();
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    showUs.setNum(num);

    try
    {
      System.out.println("Press enter to start the timer and the game.");
      input.readLine();
    }
    catch(IOException e){}

    for(questionN = 1, t = System.currentTimeMillis() / 1000, correct = 0; questionN <= showUs.getNum(); questionN++)
      correct += question(questionN);

    t = System.currentTimeMillis() / 1000 - t;

    timer = (int)(t + 0.5);

    showUs.finishGame(correct, timer);
  }

  private int question(int questionN)
  {
    int ans = 0;

    switch((int)(Math.random() * 100) % 1)
    {
      case 0:
        MathQs mathQ = new MathQs();
        ans = mathQ.mathQ(questionN);
        break;
    }

    return ans;
  }
}
