class StringComparison
{
  public static void main(String[] args) {

    //Class Declarations

    String  password;



    //Class Initialisations

    password  = "bingo";



    //Class Actions

    try{
      if(args[0].equals(password)){
        System.out.println("Congratulations you inputted the right password.");
      }
      else{
        System.out.println("WRONG.");
      }
    }
    catch(Exception e){
      System.out.println("Password Required.");
    }

  }
}
