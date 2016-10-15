class Precedence
{
	public static void main (String[] args)
	{

	//Declarations
	int sum;



	//Initialisations
	sum = 0;



	//Actions
	sum = 32 - 8 + 16 * 2; // = 56
	System.out.println("Default Order:\n\t\t 32 -  8 + 16   * 2\t= " +
			sum);

	sum = (32 - 8 + 16) * 2; // = 80
	System.out.println("Specified Order:\n\t\t(32 -  8 + 16 ) * 2\t= " +
			sum);

	sum = (32 - (8 + 16)) * 2; // = 16
	System.out.println("Nested Order:\n\t\t(32 - (8 + 16)) * 2\t= " +
			sum);

	}
}
