import java.text.NumberFormat;
import java.text.SimpleDateFormat;
class Formats
{
  public static void main(String[] args)
  {
    NumberFormat nf = NumberFormat.getNumberInstance();
    NumberFormat cf = NumberFormat.getCurrencyInstance();
    NumberFormat pf = NumberFormat.getPercentInstance();
    java.util.Calendar cal = java.util.Calendar.getInstance();
    SimpleDateFormat df = new SimpleDateFormat("d/M/y");
    SimpleDateFormat tf = new SimpleDateFormat("H:m:s");

    System.out.println("\nNumber: " + nf.format(123456789));
    System.out.println("\nCurrency: " + cf.format(1234.50f));
    System.out.println("\nPercent: " + pf.format(0.75f));
    System.out.println("\nDate: " + df.format(cal.getTime()));
    System.out.println("\nTime: " + tf.format(cal.getTime()));
  }
}
