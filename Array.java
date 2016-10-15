class Array
{
	public static void main (String[] args)
	{

		//Class Declarations

		String[]	str 	= new String[3];
		int[]		num 	= new int[3];;



		//Class Initialisations

		//String Array Initialisations
		str[0] 	= "Much ";
		str[1]	= "More ";
		str[2]	= "Java ";

		//Integer Array Initialisations
		num[0]	= 100;
		num[1]	= 200;



		//Class Actions

		//Print out array lengths
		System.out.println("String array length is " +
				str.length);

		System.out.println("Integer array length is " +
				num.length);



		//Changing one array element value
		str[1]	= "Better ";



		//Stating array elements
		System.out.println(num[0] + ", " +
				num[1] + ", " +
				num[2]);

		System.out.println(str[0] +
				str[1] +
				str[2]);



	}
}
