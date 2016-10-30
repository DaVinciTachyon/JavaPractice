class StringSearch
{
	public static void main (String[] args)
	{

		//Class Declarations

		String	books[];
		int	counter1,
				counter2,
				counter3;



		//Class Initialisations

		books[]	= { "Java in easy steps",
			"XML in easy steps",
			"HTML in easy steps",
			"CSS in easy steps",
			"Gone with the Wind",
			"Drop the Defense"}
		counter1	= 0;
		counter2	= 0;
		counter3	= 0;



		//Class Actions

		for(int i = 0, i < books.length; i++){
			System.out.print(books[i].substring(0,4) + "|");
			if (books[i].endsWith("in easy steps")){
				counter1++;
			}
			if (books[i].startsWith("Java")){
				counter2++;
			}
			if (books[i].indexOf("easy") == -1){
				counter3++;
			}
		}
		System.out.println("\nFound " + counter1 + " titles from this series");
		System.out.println("Found " + counter2 + " Java title");
		System.out.println("Found " + counter3 + " other titles");

	}
}
