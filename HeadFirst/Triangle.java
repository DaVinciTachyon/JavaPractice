class Triangle//Used to practice using classes, class variables and functions
{

  //Triangle Variables
  double area;
  int height,
      length;

  public static void main(String[] args)
  {
    //Declarations
    int x,
        y;
    Triangle[] ta = new Triangle[4];
    Triangle ta5;

    //Initialisation of x
    x = 0;

    while(x < 4)
    {
      //Initialisation of Triangles
      ta[x] = new Triangle();
      ta[x].height = (x + 1) * 2;
      ta[x].length = x + 4;
      ta[x].setArea();

      //Display of Triangle Details
      System.out.println("Triangle " + x +
        ": Area = " + ta[x].area);
      x++;
    }//end of intialisations of triangles

    //Messing with components and reference variables
    y = x;
    x = 27;
    t5 = ta[2];
    ta[2].area = 343;
    System.out.println("y = " + y + ": t5 area = " + t5.area);

  }//end of main function

  void setArea()//calculate the area of the triangle
  {
    area = (height * length) / 2;
  }
}
