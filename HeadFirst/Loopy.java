public class Loopy
{
  public static void main(String[] args)
  {
    int x;
    x = 1;
    System.out.println("Before the loop");
    while (x < 4)
    {
      System.out.println("In the loop");
      System.out.println("x = " + x);
      x++;
    }
    System.out.println("After the loop");
  }
}
