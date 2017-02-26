import java.io.*;

public class QuizPlayer
{
  String answerQuestion()
  {
    String answer = "";

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    try
    {
      answer = input.readLine();
    }
    catch(IOException e){}

    return answer;
  }
}
