class Compare
{
	public static void main (String[] args)
	{

		//Class Declarations

		float	num1,
			num2;



		//Class Initialisations

		num1 = 24.25f;
		num2 = 25;



		//Class Actions

		//Displaying Numbers
		System.out.println( "The numbers are " + num1 + " and " + num2 );
		//Greatest Number
		System.out.println( "The greater number is " + Math.max(num1, num2) );
		//Smallest Number
		System.out.println( "The smallest number is " + Math.min(num1, num2) );
	}
}
