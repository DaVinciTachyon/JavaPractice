class Question//acknowledging the fact that functions return values
{
  int meaningOfLife()//the answer to the meaning of life
  {
    return 42;
  }
}

class QuestionTest//testing the meaning of life
{
  public static void main(String[] args)
  {
    Question m = new Question();
    System.out.println("What is the meaning of life? " + m.meaningOfLife() );//asking the question and getting an answer
  }
}
