class Dog//learn that method can act differently based of changing instance variables
{

  int size;
  String name;

  void bark()
  {
    if(size > 60)//Big dog barks
      System.out.println("Woof! Woof!");
    else if(size > 14)//Middle size dog barks
      System.out.println("Ruff! Ruff!");
    else//Small dog barks
      System.out.println("Yip! Yip!");
  }//end of bark method

}//end of dog class

class DogTest//TestRun of the Dog class
{

  public static void main(String[] args)
  {
    //Initialisations
    Dog[] d = new Dog[3];
    for(int i = 0; i < 3; i++)
      d[i] = new Dog();

    //Declarations
    d[1].size = 70;
    d[2].size = 8;
    d[3].size = 35;

    //Allow each dog to bark
    for(int i = 0; i < 3; i++)
      d[i].bark();
  }//end of main function

}//end of DogTest class
