class Label
{
	public static void main (String[] args)
	{

		//Actions

		//outerLoop
		outerLoop: for (int i = 1; i < 4; i++)
		{

			//innerLoop
			innerLoop: for (int j = 1; j < 4; j++)
			{

				if (i == 1 && j == 1)
				{
					System.out.println("Continues innerLoop when i = " +
							i +
							" and j = " +
							j);
					continue;
				}
				if (i == 1 && j == 3)
				{
					System.out.println("Continues outerLoop when i = " +
							i +
							" and j = " +
							j);
					continue outerLoop;
				}

				if (i == 2 && j == 3)
				{
					System.out.println("Breaks outerLoop when i = " +
							i +
							" and j = " +
							j);
					break outerLoop;
				}

				System.out.println("Running i = " +
						i +
						" j = " +
						j);
			}
		}

	}
}
