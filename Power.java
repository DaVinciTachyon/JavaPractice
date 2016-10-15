class Power
{
	public static void main (String[] args)
	{

		//Class Declarations

		int num,
				square,
				cube,
				sqrt;



		//Class Initialisations

		num			= Integer.parseInt(args[0]);
		square	= (int) Math.pow(num, 2);
		cube		= (int) Math.pow(num, 3);
		sqrt		= (int) Math.sqrt(num);



		//Class Actions

		System.out.println(num + " squared is " +
											square);
		System.out.println(num + " cubed is " +
											cube);
		//Finds the square root of perfect squares
		System.out.println("Square root of is " + num +
											" is " + sqrt);

	}
}
