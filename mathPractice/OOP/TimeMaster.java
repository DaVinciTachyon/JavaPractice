class TimeMaster
{
  private int time;

  public TimeMaster()
  {
    setInitialTime();
  }
  public TimeMaster(int t)
  {
    time = t;
  }

  public void setInitialTime()
  {
    time = (int)(System.currentTimeMillis() / 1000);
  }
  public void setFinalTime()
  {
    time = (int)(System.currentTimeMillis() / 1000) - time;
  }
  public int getTime()
  {
    return time;
  }
}
