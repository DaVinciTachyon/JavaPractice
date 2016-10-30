class Lottery
{
	public static void main (String[] args)
	{

		//Class Declarations

		int[] nums;



		//Class Initialisations

		nums = new int[50];
		for(int i = 1; i < 50; i++)
		{
			nums[i] = i;
		}



		//Class Actions

		for(int i = 1; i<50; i++)
		{
			int r = (int) Math.ceil( Math.random() * 49 );
			int temp = nums[i];
			nums[i] = nums[r];
			nums[r] = temp;
		}
		for(int i = 1; i < 7; i++)
		{
			System.out.print( Integer.toString( nums[i] ) + " " );
		}
		System.out.println();

	}
}
