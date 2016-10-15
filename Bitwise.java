class Bitwise
{
	public static void main (String[] args)
	{
	
	//Declarations
	
	int fs;



	//Initialisations
	
	fs = 53; //In Bits: 00110101



	//Actions
	
	//AND
	System.out.println("\nAND");
	System.out.println("Flag 1: " +
			(((fs&1) > 0) ? "ON" : "off"));
	System.out.println("Flag 2: " +
			(((fs&2) > 0) ? "ON" : "off"));
	System.out.println("Flag 3: " +
			(((fs&4) > 0) ? "ON" : "off"));
	System.out.println("Flag 4: " +
			(((fs&8) > 0) ? "ON" : "off"));
	System.out.println("Flag 5: " +
			(((fs&16) > 0) ? "ON" : "off"));
	System.out.println("Flag 6: " +
			(((fs&32) > 0) ? "ON" : "off"));
	System.out.println("Flag 7: " +
			(((fs&64) > 0) ? "ON" : "off"));
	System.out.println("Flag 8: " +
			(((fs&128) > 0) ? "ON" : "off"));

	//OR
	System.out.println("\nOR");
	System.out.println("Flag 1: " +
			(((fs|1) > 0) ? "ON" : "off"));
	System.out.println("Flag 2: " +
			(((fs|2) > 0) ? "ON" : "off"));
	System.out.println("Flag 3: " +
			(((fs|4) > 0) ? "ON" : "off"));
	System.out.println("Flag 4: " +
			(((fs|8) > 0) ? "ON" : "off"));
	System.out.println("Flag 5: " +
			(((fs|16) > 0) ? "ON" : "off"));
	System.out.println("Flag 6: " +
			(((fs|32) > 0) ? "ON" : "off"));
	System.out.println("Flag 7: " +
			(((fs|64) > 0) ? "ON" : "off"));
	System.out.println("Flag 8: " +
			(((fs|128) > 0) ? "ON" : "off"));

	//XOR
	System.out.println("\nXOR");
	System.out.println("53 ^ 1: " +
			(fs^1));
	System.out.println("53 ^ 2: " +
			(fs^2));
	System.out.println("53 ^ 4: " +
			(fs^4));
	System.out.println("53 ^ 8: " +
			(fs^8));
	System.out.println("53 ^ 16: " +
			(fs^16));
	System.out.println("53 ^ 32: " +
			(fs^32));
	System.out.println("53 ^ 64: " +
			(fs^64));
	System.out.println("53 ^ 128: " +
			(fs^128));

	//NOT
	System.out.println("\nNOT");
	System.out.println("Flag: " +
			(~fs));

	//Left Shift
	System.out.println("\nLeft Shift");
	System.out.println("Left Shift: " +
			(fs<<1));

	//Right Shift
	System.out.println("\nRight Shift");
	System.out.println("Right Shift: " +
			(fs>>1));
	
	}
}
