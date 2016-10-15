class Option
{
	public static void main (String[] args)
	{

		//Class constant declarations

		final String ArgIndicator;



		//Class variable declarations

		String[]	ArgLang		= new String[2];
		String[]	OptionLang	= new String[2];
		String OptionUnrec;



		//Class coonstant initialisations

		ArgIndicator = "-";



		//Class variable initialisations

                ArgLang[0]	= "en";
                ArgLang[1]	= "es";
                OptionLang[0]	= "English Option";
                OptionLang[1]	= "Spanish Option";
                OptionUnrec	= "Unrecognised Option";



		//Class Actions

		if(args.length == 0)
		{
			System.out.println(OptionUnrec);
		}

		else if(args[0].equals(ArgLang[0]))
		{
			System.out.println(OptionLang[0]);
		}

		else if(args[0].equals(ArgLang[1]))
		{
			System.out.println(OptionLang[1]);
		}

		else System.out.println(OptionUnrec);

	}
}
