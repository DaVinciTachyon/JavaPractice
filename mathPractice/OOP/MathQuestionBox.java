import java.util.*;

class MathQuestionBox implements QuestionBox
{
  private String question;
  private String answer;

  public MathQuestionBox()
  {
    question = "";
    answer = "";
  }

  public String getQuestion()
  {
    switch((int)(Math.random() * 1000) % 4)
    {
      case 0:
        additionQuestion(50, 2);
        break;
      case 1:
        subtractionQuestion(50, 2);
        break;
      case 2:
        multiplicationQuestion(13, 2);
        break;
      case 3:
        divisionQuestion(13);
        break;
    }
    return question;
  }

  public String getAnswer()
  {
    return answer;
  }

  private void additionQuestion(int n, int size)
  {
    int i, sum;
    ArrayList<Integer> q = new ArrayList<Integer>();

    for(i = 0, sum = 0; i < size; i++)
    {
      q.add((int)(Math.random() * 100) % (n + 1));
      sum += q.get(i);
      question += q.get(i);
      if(i == size - 1)
        question += ":\n\t\t";
      else
        question += " + ";
    }
    answer = Integer.toString(sum);
  }

  private void subtractionQuestion(int n, int size)
  {
    int i, sum;
    ArrayList<Integer> q = new ArrayList<Integer>();

    q.add((int)(Math.random() * 100) % (n + 1));
    question += (sum = q.get(0));
    if(size == 1)
      question += ":\n\t\t";
    else
    {
      question += " - ";
      for(i = 1; i < size; i++)
      {
        q.add((int)Math.random() % (n + 1));
        sum -= q.get(i);
        question += q.get(i);
        if(i == size - 1)
          question += ":\n\t\t";
        else
          question += " - ";
      }
    }
    answer = Integer.toString(sum);
  }

  private void multiplicationQuestion(int n, int size)
  {
    int i, sum;
    ArrayList<Integer> q = new ArrayList<Integer>();

    for(i = 0, sum = 1; i < size; i++)
    {
      q.add((int)(Math.random() * 100) % (n + 1));
      sum *= q.get(i);
      question += q.get(i);
      if(i == size - 1)
        question += ":\n\t\t";
      else
        question += " * ";
    }
    answer = Integer.toString(sum);
  }

  private void divisionQuestion(int n)
  {
    double[] q = new double[2];
    double sum;

    do
    {
      do
      {
        q[1] = Math.floor(Math.random() * 100) % (n + 1);
      } while(q[1] == 0);
      q[0] = Math.floor(Math.random() * 100) % (int)(q[1] * q[1] + 1);
      sum = q[0] / q[1];
    } while(sum % 1 != 0);
    question = Integer.toString((int)q[0]) + " ÷ " + Integer.toString((int)q[1]) + ":\n\t\t";
    answer = Integer.toString((int)sum);
  }

  private double modulus(double n, double m)
  {
    return (((n / m) - Math.floor(n / m)) * n);
  }
}
