class Loops
{
	public static void main (String[] args)
	{

		//Class Declarations

		//Array Declarations
		String[]	htm	= new String[4];
		String[]	xml	= new String[4];

		//Integer Declarations
		int	j,
			k;



		//Class Initialisations

		//Array Initialisations
		htm[0]	= "HTML5";
		htm[1]	= "in";
		htm[2]	= "easy";
		htm[3]	= "steps";
		xml[0]	= "XML";
		xml[1]	= "in";
		xml[2]	= "easy";
		xml[3]	= "steps";
 
		//Integer Initialisations
		j	= k	= 0;



		//Class Actions

		if(args.length > 0)
		{
			for(int i = 0; i < args.length; i++)
			{
				System.out.println("args[" + i +
						"] is | " + args[i]);
			}
		}

		while(j < htm.length)
		{
			System.out.println("htm[" + j +
					"] is | " + htm[j]);
			j++;
		}

		if(xml.length > 0) do
		{
			System.out.println("\txml[" + k +
					"] is | " + xml[k]);
			k++;
		} while(k < xml.length);

	}
}
