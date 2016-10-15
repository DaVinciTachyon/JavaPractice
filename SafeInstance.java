class Car
{
  //Class Initialisations
  private String maker;
  private String colour;
  private String bodyType;
  //Accelerate Function
  private String accelerate(){
    String motion = "Accelerating...";
    return motion;
  }
  //setCar Function
  public void setCar(String brand, String paint, String style){
    maker = brand;
    colour = paint;
    bodyType = style;
  }
  //getCar Function
  public void getCar(){
    System.out.println(maker + " paint is " + colour);
    System.out.println(maker + " style is " + bodyType);
    System.out.println(maker + " is " + accelerate() + "\n");
  }
}
class SafeInstance
{
  public static void main(String args[]){
    //Initialisations
    Car Porsche = new Car(), Bentley = new Car();
    //Actions
    //Porsche
    Porsche.setCar("Porsche","Red","Coupe");
    Porsche.getCar();
    //Bentley
    Bentley.setCar("Bentley","Green","Saloon");
    Bentley.getCar();
  }
}
