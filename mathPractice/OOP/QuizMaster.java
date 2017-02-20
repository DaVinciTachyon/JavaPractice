class QuizMaster extends QuizBoard
{
  void questionRound(QuizPlayer player, int questionN)
  {
    MathQuestions question = new MathQuestions();
    askQuestion(questionN, question);
    player.answerQuestion();
    if(question.checkAns(player.getAnswer()) == 1)
    {
      player.setScoreIncrement();
      correctAnswer();
    }
    else
      wrongAnswer(question.getAnswer());
  }

  void askQuestion(int questionN, MathQuestions question)
  {
    System.out.print("Question " + questionN + ":\n\t");
    switch((int)(Math.random() * 100) % 1)
    {
      case 0:
        //(MathQuestions)question;
        question.setQ();
        break;
    }
    System.out.print(question.getQuestion());
  }

  void correctAnswer()
  {
    System.out.println("\tCorrect.\n");
  }

  void wrongAnswer(String answer)
  {
    System.out.println("\tWrong, the correct answer is " + answer + ".\n");
  }
}
