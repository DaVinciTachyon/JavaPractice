class Display
{
  private int num;

  public void setNum(int n)
  {
    num = n;
  }
  public int getNum()
  {
    return num;
  }

  void finishGame(int correct, int timer)
  {
    if(timer == 1)
    {
      if(num > 1)
        System.out.println("You answered " + correct + " out of " + num + " questions correctly in 1 second.\n");
      else
        System.out.println("You answered " + correct + " out of 1 question correctly in 1 second.\n");
    }
    else
    {
      if(num > 1)
        System.out.println("You answered " + correct + " out of " + num + " questions correctly in " + timer + " seconds.\n");
      else
        System.out.println("You answered " + correct + " out of 1 question correctly in " + timer + " seconds.\n");
    }
  }
}
