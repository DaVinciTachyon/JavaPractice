class ScoreMaster
{
  private int score;

  public ScoreMaster()
  {
    score = 0;
  }
  public ScoreMaster(int s)
  {
    score = s;
  }

  public void setScoreIncrement()
  {
    score++;
  }
  public int getScore()
  {
    return score;
  }
}
