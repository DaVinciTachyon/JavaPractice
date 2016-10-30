class CharacterSwap
{
	public static void main (String[] args)
	{

		//Class Declarations

		String	txt;
		char 		initial;



		//Class Initialisations

		txt	= "";



		//Class Actions

		if (txt.isEmpty()) txt = "	Borrocudo	";
		System.out.println("String: " + txt);
		System.out.println("Original String Length: " + txt.length());
		txt = txt.trim();
		System.out.println("String: " + txt);
		System.out.println("String Length: " + txt.length());
		initial = txt.charAt(0);
		System.out.println("First Letter: " + initial);
		initial = txt.charAt(txt.length() - 1);
		System.out.println("Last Letter: " + initial);
		txt = txt.replace('o', 'a');
		System.out.println("String: " + txt);


	}
}
