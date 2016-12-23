class Clock//Learning the use of getting and setting
{
  private String time;//class exclusive time variable

  public void setTime(String t)//Setting the time
  {
    t = time;
  }
  public String getTime()//Returning the time
  {
    return time;
  }

}//end of Clock class

class ClockTest//Testing the clock classes' functionalities
{
  
  public static void main(String[] args)
  {
    //Declarations
    Clock c;
    String tod;

    //Initialisations
    c = new Clock();
    c.setTime("1234");
    tod = c.getTime();

    //Printing the time of day
    System.out.println("time: " + tod);
  }//end of main function

}//end of ClockTest class
