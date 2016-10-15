class StringSearch
{
	public static void main (String[] args)
	{

		//Class Declarations

		String	books[]	= new String[6];
		int	counter1,
				counter2,
				counter3;



		//Class Initialisations

		books[0]	=	"Java in easy steps";
		books[1]	= "XML in easy steps";
		books[2]	= "HTML in easy steps";
		books[3]	= "CSS in easy steps";
		books[4]	= "Gone with the Wind";
		books[5]	= "Drop the Defense";
		counter1	= 0;
		counter2	= 0;
		counter3	= 0;



		//Class Actions

		for(int i = 0; i < books.length; i++){
			System.out.print(books[i] + " | ");
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
		System.out.println("\nFound " + counter1 + " titles from the \"in easy steps\" series");
		System.out.println("Found " + counter2 + " Java title");
		System.out.println("Found " + counter3 + " other titles");

	}
}
