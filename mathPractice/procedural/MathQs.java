import java.util.*;

class MathQs
{
  private double sum;
  private int ans;

  int mathQ(int questionN)
  {
    System.out.print("Question " + questionN + ":\n\t");
    setQ();
    setAns();
    return feedback();
  }

  void setQ()
  {
    switch((int)(Math.random() * 100) % 4)
    {
      case 0:
        add(50, 2);
        break;
      case 1:
        subtract(50, 2);
        break;
      case 2:
        multiply(13, 2);
        break;
      case 3:
        divide(13);
        break;
    }
  }

  void setAns()
  {
    Scanner input = new Scanner(System.in);
    ans = input.nextInt();
  }

  int feedback()
  {
    if((int)sum == ans)
    {
      System.out.println("\tCorrect.\n");
      return 1;
    }
    else
    {
      System.out.println("\tWrong, the answer is " + (int)sum + ".\n");
      return 0;
    }
  }

  void add(int n, int size)
  {
    int i;
    ArrayList<Integer> q = new ArrayList<Integer>();

    for(i = 0, sum = 0; i < size; i++)
    {
      q.add((int)(Math.random() * 100) % (n + 1));
      sum += q.get(i);
      System.out.print((int)q.get(i));
      if(i == size - 1)
        System.out.print(":\n\t\t");
      else
        System.out.print(" + ");
    }
  }

  void subtract(int n, int size)
  {
    int i;
    ArrayList<Integer> q = new ArrayList<Integer>();

    q.add((int)(Math.random() * 100) % (n + 1));
    System.out.print((int)(sum = q.get(0)));
    if(size == 1)
      System.out.print(":\n\t\t");
    else
    {
      System.out.print(" - ");
      for(i = 1; i < size; i++)
      {
        q.add((int)Math.random() % (n + 1));
        sum -= q.get(i);
        System.out.print((int)q.get(i));
        if(i == size - 1)
          System.out.print(":\n\t\t");
        else
          System.out.print(" - ");
      }
    }
  }

  void multiply(int n, int size)
  {
    int i;
    ArrayList<Integer> q = new ArrayList<Integer>();

    for(i = 0, sum = 1; i < size; i++)
    {
      q.add((int)(Math.random() * 100) % (n + 1));
      sum *= q.get(i);
      System.out.print((int)q.get(i));
      if(i == size - 1)
        System.out.print(":\n\t\t");
      else
        System.out.print(" * ");
    }
  }

  void divide(int n)
  {
    double[] q = new double[2];

    do
    {
      do
      {
        q[1] = Math.floor(Math.random() * 100) % (n + 1);
      } while(q[1] == 0);
      q[0] = Math.floor(Math.random() * 100) % (int)(q[1] * q[1] + 1);
      sum = q[0] / q[1];
    } while(sum % 1 != 0);
    System.out.print((int)q[0] + " ÷ " + (int)q[1] + ":\n\t\t");
  }

  double modulus(double n, double m)
  {
    return (((n / m) - Math.floor(n / m)) * n);
  }
}
