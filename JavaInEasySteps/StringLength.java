class StringLength
{
	public static void main (String[] args)
	{

		//Class Declarations

		String	lang,
						series,
						title;



		//Class Initialisations

		lang 		= "Java";
		series	= " in easy steps!";
		title		= lang.concat(series);



		//Class Actions

		System.out.println("\"" + title + "\" has "
			+ title.length() + " characters");

	}
}
