import java.io.*;
class ReadString
{
  public static void main(String[] args){

    String input = "";
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(isr);

    System.out.print("Enter the title of this book: ");
    try{
      input = buffer.readLine();
      buffer.close();
    } catch( IOException e ){
      System.out.println("An input error has occured");
    }
    System.out.println("Thanks.\nYou are reading " + input);

  }
}
