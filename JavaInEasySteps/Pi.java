class Pi
{
	public static void main (String[] args)
	{
		try{
			//Class Declarations

			float radius,
						shortPi,
						circ,
						area;



			//Class Initialisations

			radius	= Float.parseFloat(args[0]);
			shortPi	= (float) Math.PI;
			circ		= shortPi * 2 * radius;
			area		= shortPi * radius * radius;



			//Class Actions

			System.out.println("With Pi commuted from " + Math.PI +
												" to " + shortPi + "...");
			System.out.println("A circle of radius " + radius +
												" cm has a circumference of " + circ +
												" cm and an area of " + area + " sq.cm");

		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Write something!");
		}
		catch(NumberFormatException e){
			System.out.println("Please just try using the right format, use numbers...");
		}
	}
}
