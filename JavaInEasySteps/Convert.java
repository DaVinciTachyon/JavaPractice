class Convert
{
	public static void main (String[] args)
	{

		//Class Declarations

		float	daysFloat;
		String	weeksString;
		int	daysInt,
			weeksInt,
			week;



		//Class Initialisations

		daysFloat	= 365.25f;
		weeksString	= "52";
		daysInt		= (int) daysFloat;
		weeksInt	= Integer.parseInt(weeksString);
		week		= daysInt / weeksInt;



		//Class Actions

		System.out.println("Days per week: " +
				week);

	}
}
