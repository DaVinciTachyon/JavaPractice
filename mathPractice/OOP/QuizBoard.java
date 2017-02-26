import java.util.*;

abstract class QuizBoard
{
  String gameInstructions;

  public QuizBoard()
  {
    gameInstructions = "This is the maths game.";
  }

  abstract void startQuiz();

  abstract void describeQuiz();

  abstract void giveScore(int score, int numberOfQuestions, int time);

  abstract void endQuiz(ArrayList<Integer> winner);
}
