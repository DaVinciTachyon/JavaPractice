class Random
{
	public static void main (String[] args)
	{

		//Class Declarations

		float	random,
			multiplied,
			randomInt;



		//Class Initialisations

		random 		= (float) Math.random();
		multiplied 	= random * 10;
		randomInt	= (int) Math.ceil(multiplied);



		//Class Actions

		System.out.println( "Random Number: " + random );
		System.out.println( "Multiplied number: " + multiplied );
		System.out.println( "Random Integer: " + randomInt );

	}
}
