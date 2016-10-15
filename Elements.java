class Elements
{
	public static void main (String[] args)
	{

		//Class Declarations

		//Kiosk Array Declarations
		int[]	kiosk_q1	= new int[3];
		int[]	kiosk_q2	= new int[3];
		int[]	kiosk_q3	= new int[3];
		int[]	kiosk_q4	= new int[3];

		//Outlet Array Declarations
		int[]	outlet_q1	= new int[3];
		int[]	outlet_q2	= new int[3];
		int[]	outlet_q3	= new int[3];
		int[]	outlet_q4	= new int[3];

		//Result Declarations
		int[]	sum		= new int[12];
		int	total;



		//Class Initialisations

		//Kiosk Initialisations
		kiosk_q1[0]	= 42000;
		kiosk_q1[1]	= 48000;
		kiosk_q1[2]	= 50000;

		kiosk_q2[0]	= 52000;
		kiosk_q2[1]	= 58000;
		kiosk_q2[2]	= 60000;

		kiosk_q3[0]	= 46000;
		kiosk_q3[1]	= 49000;
		kiosk_q3[2]	= 58000;

		kiosk_q4[0]	= 50000;
		kiosk_q4[1]	= 51000;
		kiosk_q4[2]	= 61000;


		//Outlet Initialisations
		outlet_q1[0]	= 57000;
		outlet_q1[1]	= 63000;
		outlet_q1[2]	= 60000;

		outlet_q2[0]	= 70000;
		outlet_q2[1]	= 67000;
		outlet_q2[2]	= 73000;

		outlet_q3[0]	= 67000;
		outlet_q3[1]	= 65000;
		outlet_q3[2]	= 62000;

		outlet_q4[0]	= 72000;
		outlet_q4[1]	= 69000;
		outlet_q4[2]	= 75000;


		//Result Initialisations
		total	= 0;



		//Class Actions

		for(int i = 0; i < kiosk_q1.length; i++)
		{
			sum[i]		= kiosk_q1[i] +
					outlet_q1[i];
			sum[i+3]	= kiosk_q2[i] +
					outlet_q2[i];
			sum[i+6]	= kiosk_q3[i] +
					outlet_q3[i];
			sum[i+9]	= kiosk_q4[i] +
					outlet_q4[i];
		}

		for(int i = 0; i < sum.length; i++)
		{
			System.out.println("Month " + (i + 1) +
					" sales:\t" + sum[i]);
			total	+= sum[i];
		}

		System.out.println("TOTAL YEAR SALES\t" + total);
	}
}
