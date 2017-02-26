class QuestionMaster
{
  private int numberOfQuestions;
  private int maxNumberOfQuestions;

  public QuestionMaster()
  {
    this(10);
  }
  public QuestionMaster(int q)
  {
    maxNumberOfQuestions = 15;
    numberOfQuestions = q % maxNumberOfQuestions + 1;
  }

  void setNumberOfQuestions()
  {
    numberOfQuestions = (int)(Math.random() * 1000) % maxNumberOfQuestions + 1;
  }

  int getNumberOfQuestions()
  {
    return numberOfQuestions;
  }

  void askQuestion(QuizPlayer player, int questionN, ScoreMaster score)
  {
    QuestionBox question = null;

    switch((int)(Math.random() * 1000) % 1)
    {
      case 0:
        question = new MathQuestionBox();
        break;
    }

    System.out.print("Question " + questionN + ":\n\t");
    System.out.print(question.getQuestion());

    checkResponse(player, player.answerQuestion(), question.getAnswer(), score);
  }

  void checkResponse(QuizPlayer player, String response, String answer, ScoreMaster score)
  {
    if(Integer.parseInt(response) == Integer.parseInt(answer))
    {
      System.out.println("\tCorrect.\n");
      score.setScoreIncrement();
    }
    else
      System.out.println("\tWrong, the correct answer is " + answer + ".\n");
  }
}
