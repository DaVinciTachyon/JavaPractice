import java.util.*;
import java.io.*;

class QuizMaster extends QuizBoard
{
  int numberOfPlayers;

  void startQuiz()
  {
    QuestionMaster questionMaster = new QuestionMaster();
    ArrayList<QuizPlayer> player = new ArrayList<QuizPlayer>();
    ArrayList<TimeMaster> timer = new ArrayList<TimeMaster>();
    ArrayList<ScoreMaster> score = new ArrayList<ScoreMaster>();
    int playerN,
        questionN;

    describeQuiz();
    questionMaster.setNumberOfQuestions();
    setNumberOfPlayers();
    for (playerN = 0; playerN < numberOfPlayers; playerN++)
    {
      player.add(new QuizPlayer());
      score.add(new ScoreMaster());
      timer.add(new TimeMaster());
    }
    for (playerN = 0; playerN < numberOfPlayers; playerN++)
    {
      readyPlayer(playerN + 1, questionMaster.getNumberOfQuestions());
      timer.get(playerN).setInitialTime();
      for(questionN = 1; questionN <= questionMaster.getNumberOfQuestions(); questionN++)
        questionMaster.askQuestion(player.get(playerN), questionN, score.get(playerN));
      timer.get(playerN).setFinalTime();
      giveScore(score.get(playerN).getScore(), questionMaster.getNumberOfQuestions(), timer.get(playerN).getTime());
    }
    endQuiz(findWinner(score, timer));
  }

  void describeQuiz()
  {
    System.out.println(gameInstructions);
  }

  void setNumberOfPlayers()
  {
    System.out.print("How many players are there?\n\t");
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    try
    {
      numberOfPlayers = Integer.parseInt(input.readLine());
    }
    catch(IOException e){}
  }

  void readyPlayer(int playerN, int numberOfQuestions)
  {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("\nPlayer " + playerN + ":\n");
    System.out.println("I will ask you " + numberOfQuestions + " questions to which you must give the correct answer.");
    System.out.println("Press enter to start the timer and the game.");
    try
    {
      input.readLine();
    }
    catch(IOException e){}
  }

  void giveScore(int score, int numberOfQuestions, int time)
  {
    if (time == 1)
    {
      if (numberOfQuestions == 1)
        System.out.println("You scored " + score + " out of " + numberOfQuestions + " question in 1 second.");
      else
        System.out.println("You scored " + score + " out of " + numberOfQuestions + " questions in 1 second.");
    }
    else
    {
      if (numberOfQuestions == 1)
        System.out.println("You scored " + score + " out of " + numberOfQuestions + " question in " +  time + " seconds.");
      else
        System.out.println("You scored " + score + " out of " + numberOfQuestions + " questions in " +  time + " seconds.");
    }
  }

  ArrayList<Integer> findWinner(ArrayList<ScoreMaster> score, ArrayList<TimeMaster> timer)
  {
    ArrayList<Integer> winner = new ArrayList<Integer>();
    int playerN;
    double winnerScore;

    for (playerN = 0, winnerScore = 0; playerN < numberOfPlayers; playerN++)
    {
      if((double)score.get(playerN).getScore()/(double)timer.get(playerN).getTime() == winnerScore)
      {
        winner.add(playerN);
      }
      else if((double)score.get(playerN).getScore()/(double)timer.get(playerN).getTime() > winnerScore)
      {
        for (int i = winner.size() - 1; i >= 0; i--)
          winner.remove(i);
        winner.add(playerN);
        winnerScore = score.get(playerN).getScore();
      }
    }
    return winner;
  }

  void endQuiz(ArrayList<Integer> winner)
  {
    if(winner.size() == 1)
      System.out.println("Player " + (winner.get(0) + 1) + " is the winner.");
    else
      for(int i = 0; i < winner.size(); i++)
        System.out.println("Player " + (winner.get(i) + 1) + " is a winner.");
  }
}
