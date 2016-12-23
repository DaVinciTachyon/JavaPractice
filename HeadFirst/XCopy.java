class XCopy//Learning the use of return values in functions
{
  public static void main(String[] args)//main functions
  {
    //Declarations
    int orig,
        y;
    XCopy x;

    //Initialisations
    orig = 42;
    x = new XCopy();
    y = x.go(orig)

    //Print the results
    System.out.println(orig + " " +
      y);
  }

  int go(int arg)//doubles the input
  {
    return arg * 2;
  }
}
