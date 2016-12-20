class Books//Allows the addition of a new book to the BooksTest class
{
  String  title,
          author;
}//end of class Books

class BooksTest//Allows the application of the Books class into a simulated context
{
  public static void main(String[] args)
  {
    //Declarations
    Books[] myBooks = new Books[3];
    int x,
        i;
    for(i = 0; i < 3; i++)
      myBooks[i] = new Book();

    //Initialisations
    x = 0;
    myBooks[0].title = "The Grapes of Java";
    myBooks[1].title = "The Java Gatsby";
    myBooks[2].title = "The Java Cookbook";
    myBooks[0].author = "Bob";
    myBooks[1].author = "Sue";
    myBooks[2].author = "Ian";

    //Display of book collection
    while(x < 3)
    {
      System.out.print(myBooks[x].title + " by " + myBooks[x].author);
      x++;
    }//end of while loop

  }//end of main function
}//end of class BooksTest
