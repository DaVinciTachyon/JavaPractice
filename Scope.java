class Scope
{
	final static String txt = "This is a global variable of the scope class.";
	public static void main (String[] args)
	{

		//Class Declarations

		String	txt;



		//Class Initialisations

		txt = "This is a local variable in the main method.";



		//Class Actions

		System.out.println(txt);
		System.out.println(Scope.txt);
		sub();

	}
	public static void sub ()
	{

		//sub Method Declarations

		String	txt;



		//sub Method Initialisations

		txt = "This is a local variable in the sub method.";



		//sub Method Actions

		System.out.println(txt);

	}
}
