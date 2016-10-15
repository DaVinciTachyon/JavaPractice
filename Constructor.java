class Car
{
  private String maker;
  private String colour;
  private String bodyType;
  public Car(){
    maker = "Porshe";
    colour = "Silver";
    bodyType = "Coupe";
  }
  private String accelerate(){
    String motion = "Accelerating...";
    return motion;
  }
  public void setCar(String brand, String paint, String style){
    maker = brand;
    colour = paint;
    bodyType = style;
  }
  public void getCar(){
    System.out.println(maker + " paint is " + colour);
    System.out.println(maker + " style is " + bodyType);
    System.out.println(maker + " is " + accelerate() + "\n");
  }
}
class Constructor
{
  public static void main(String[] args) {
    //Initialisations
    Car Porsche = new Car(), Ferrari = new Car();

    //Declarations
    //Porsche
    Porsche.getCar();
    //Ferrari
    Ferrari.setCar("Ferrari","Red","Sport");
    Ferrari.getCar();
  }
}
