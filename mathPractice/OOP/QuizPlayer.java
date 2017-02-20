import java.io.*;

public class QuizPlayer
{
  private int score = 0;
  private String answer;
  private int time = 0;

  void setInitialTime()
  {
    time = (int)(System.currentTimeMillis() / 1000);
  }
  void setFinalTime()
  {
    time = (int)(System.currentTimeMillis() / 1000) - time;
  }
  int getTime()
  {
    return time;
  }

  String getAnswer()
  {
    return answer;
  }

  int getScore()
  {
    return score;
  }
  void setScore(int n)
  {
    score = n;
  }
  void setScoreIncrement()
  {
    score++;
  }

  void answerQuestion()
  {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    try
    {
      answer = input.readLine();
    }
    catch(IOException e){}
  }
}
