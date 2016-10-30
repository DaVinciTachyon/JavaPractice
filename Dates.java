import java.util.Calendar;
class Dates
{
  public static void main(String[] args)
  {
    Calendar cal = Calendar.getInstance();
    String fields;

    System.out.println("\nIt is now " + cal.getTime());
    cal.set(Calendar.YEAR, 2015);
    System.out.println("\nDate is now " + cal.getTime());
    fields = "\nYear:\n\t" + cal.get(Calendar.YEAR) +
      "\nMonth:\n\t" + cal.get(Calendar.MONTH) +
      "\nDay of the Month:\n\t" + cal.get(Calendar.DAY_OF_MONTH) +
      "\nDay of the Month:\n\t" + cal.get(Calendar.DAY_OF_WEEK) +
      "\nDay of the Year:\n\t" + cal.get(Calendar.DAY_OF_YEAR) +
      "\nWeek of the Year:\n\t" + cal.get(Calendar.WEEK_OF_YEAR) +
      "\nWeek of the Month:\n\t" + cal.get(Calendar.WEEK_OF_MONTH) +
      "\nDay of the Week in Month:\n\t" + cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) +
      "\nHour (0-11):\n\t" + cal.get(Calendar.HOUR) +
      "\nA.M. (0) or P.M. (1):\n\t" + cal.get(Calendar.AM_PM) +
      "\nHour (0-23):\n\t" + cal.get(Calendar.HOUR_OF_DAY) +
      "\nMinute:\n\t" + cal.get(Calendar.MINUTE) +
      "\nSecond:\n\t" + cal.get(Calendar.SECOND);
    System.out.println(fields);
  }
}
