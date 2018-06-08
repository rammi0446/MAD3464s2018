/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
import java.util.Comparator;
import java.util.Scanner;
public class Books {
    int bookId;
    String bookTitle;
    int bookRating;
    Scanner in=new Scanner(System.in);
    Books()
    {
        this.bookId=0;
        this.bookTitle="Unknown";
        this.bookRating=0;
    }

    public Books(int bookId, String bookTitle, int bookRating) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookRating = bookRating;
    }
    void setBookId(int id)
    {
        
       this.bookId=id;
    }
    int getBookId()
    {
        return bookId;
    }
     void setBookTitle(String bookTilte)
    {
        
       this.bookTitle=bookTitle;
    }
   String getBookTitle()
    {
        return bookTitle;
    }
   void setBookRating(int rate)
    {
        
      this.bookRating=rate;
    }
   int getBookRating()
    {
        return bookRating;
    }
   void displayInfo()
   {
       System.out.println("Book id :"+this.bookId+
       "Book title :"+this.bookTitle+
       "Book rating :"+this.bookRating );
   }
  
   }

class bookTitleComparator implements Comparator<Books>
{

    @Override
    public int compare(Books o1, Books o2) {
        
        return o1.bookTitle.compareToIgnoreCase(o2.bookTitle);
    }
    
}

