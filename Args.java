class Args
{
	public static void main (String[] args)
	{

		//Class Variable Declarations

		//Integer Declarations
		int 	num1,
			num2;

		//String Declarations
		String	msg;



		//Class Initialisations

		//Integer Intialisations
		num1	= Integer.parseInt(args[0]);
		num2	= Integer.parseInt(args[2]);

		//String Initialisations
		msg	= args[0] + " " +
			args[1] + " " +
			args[2] + " = ";



		//Class Actions

		if(args.length != 3)
		{
			System.out.println("Wrong number of arguments");
			return;
		}

		if(args[1].equals("+"))		msg += (num1 + num2);
		else if(args[1].equals("-"))	msg += (num1 - num2);
		else if(args[1].equals("x"))	msg += (num1 * num2);
		else if(args[1].equals("/"))	msg += (num1 / num2);
		else if(args[1].equals("%"))	msg += (num1 % num2);
		else msg = "Incorrect Operator";

		System.out.println(msg);

	}
}
