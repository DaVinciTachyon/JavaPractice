class Switch
{
	public static void main (String[] args)
	{
	
		//Declarations

		int	month,
			year,
			num;



		//Initialisations

		month	= 2;
		year	= 2016;
		num	= 31;



		//Actions

		switch (month)
		{
		case 4: case 6: case 9: case 11:
			num = 30; break;
		case 2:
			num = (year % 4 == 0) ? 29 : 28; break;
		}
		System.out.println(month +
				"/" +
				year +
				": " + 
				num +
				" days");
	
	}
}
