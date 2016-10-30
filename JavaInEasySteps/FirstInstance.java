class FirstInstance
{
	public static void main (String[] args)
	{

		System.out.println("Paint is " + Car.colour);
		System.out.println("Style is " + Car.bodyType);
		System.out.println(Car.accelerate());

		Car Porshe = new Car();
		System.out.println("Porsche paint is " + Porshe.colour);
		System.out.println("Porshe style is " + Porshe.bodyType);
		System.out.println(Porshe.accelerate());

	}
}
