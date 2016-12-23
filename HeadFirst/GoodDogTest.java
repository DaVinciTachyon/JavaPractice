class GoodDog//Using getting and setting
{

  private int size;
  private String name;

  //Setting and getting the size of the dog
  public void setSize(int num)
  {
    if(num > 0)
      size = num;
  }
  public int getSize()
  {
    return size;
  }

  //setting and getting the name of the dog
  public void setName(String nam)
  {
    name = nam;
  }
  public String getName()
  {
    return name;
  }

  void bark()//no need for and inputted number of barks
  {
    if(size > 60)//Big dog barks
      System.out.println("Woof! Woof!");
    else if(size > 14)//Middle size dog barks
      System.out.println("Ruff! Ruff!");
    else//Small dog barks
      System.out.println("Yip! Yip!");
  }//end of bark method

}//end of goodDog class

class GoodDogTest//TestRun of the Dog class
{
  public static void main(String[] args)
  {
    //Initialisations
    Dog[] d = new Dog[3];
    for(int i = 0; i < 3; i++)
      d[i] = new Dog();

    //Declarations
    d[1].setSize(70);
    d[2].setSize(8);
    d[3].setSize(35);

    //Allow each dog to bark
    for(int i = 0; i < 3; i++)
      d[i].bark();
  }//end of main function

}//end of DogTest class
