class Car
{
  private String maker;
  private String colour;
  private String bodyType;
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
class SafeInstance
{
  public static void main(String args[]){
    Car Porsche = new Car();
    Porsche.setCar("Porsche","Red","Coupe");
    Porsche.getCar();
    Car Bentley = new Car();
    Bentley.setCar("Bentley","Green","Saloon");
    Bentley.getCar();
  }
}
