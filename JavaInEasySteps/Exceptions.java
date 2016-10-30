class Exceptions
{
	public static void main (String[] args)
	{

		try{
			//Class Declarations🤔

			int num;



			//Class Initialisations🤑

			num = Integer.parseInt(args[0]);



			//Class Actions🏃🏻

			System.out.println("You entered: " + num);

		}
		//ArrayIndexOutOfBoundsException🤓
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Integer argument required.");
		}
		//NumberFormatException🤓
		catch(NumberFormatException e){
			System.out.println("Wrong Format.");
		}
		//Ending the Program❗️
		finally{
			System.out.println("Program ends.");
		}



	}
}
