abstract class QuizBoard
{
  int numberOfQuestions = 0;

  void game()
  {
    QuizPlayer player = new QuizPlayer();
    int questionN;

    describeGame();
    setNumberOfQuestions();
    player.setInitialTime();
    for (questionN = 1; questionN <= numberOfQuestions; questionN++)
      questionRound(player, questionN);
    player.setFinalTime();
    giveScore(player, player.getTime());
    endGame();
  }

  void describeGame()
  {
    System.out.println("This is the maths game.");
  }

  void giveScore(QuizPlayer player, int time)
  {
    if (time == 1)
    {
      if (numberOfQuestions == 1)
        System.out.println("You scored " + player.getScore() + " out of " + numberOfQuestions + " question in 1 second.");
      else
        System.out.println("You scored " + player.getScore() + " out of " + numberOfQuestions + " questions in 1 second.");
    }
    else
    {
      if (numberOfQuestions == 1)
        System.out.println("You scored " + player.getScore() + " out of " + numberOfQuestions + " question in " +  time + " seconds.");
      else
        System.out.println("You scored " + player.getScore() + " out of " + numberOfQuestions + " questions in " +  time + " seconds.");
    }
  }

  abstract void questionRound(QuizPlayer player, int questionN);

  void endGame()
  {
    System.out.println("The End.");
  }

  void setNumberOfQuestions()
  {
    numberOfQuestions = (int)(Math.random() * 100) % 15 + 1;
  }
}
