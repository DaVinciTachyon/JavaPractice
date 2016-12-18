class Dog
{

  String name;

  public static void name(String[] args)
  {

    //Make Dog object and access it
    Dog dog1 = new Dog();
    dog1.bark();
    dog1.name = "Bart";

    //make a dog array
    Dog[] dog = new Dog[3];
    //put some dogs in it
    for(int i = 0; i < 2; i++)
      myDogs[i] = new Dog();
    myDogs[2] = dog1;

    //access the dogs using the array
    //references
    myDogs[0].name = "Fred";
    myDogs[1].name = "Marge";

    //What is myDogs[2]'s name?
    System.out.println("The last dog's name is " + myDogs[2].name);

    //Loop through the array telling all dogs to bark
    for(int x; x < myDogs.length; x++)
      myDogs[x].bark;

  }//end of main function

  public void bark()
  {

    System.out.println(name + " says Ruff!");

  }// end of bark function

}//end of Dog class
