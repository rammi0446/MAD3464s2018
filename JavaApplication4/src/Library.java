/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
/**
 *
 * @author macstudent
 */
import java.util.*;

public class Library {
    
    public static void main(String args[])
    {
        ArrayList<String> bookId=new ArrayList<String>();
        bookId.add("B009");
        bookId.add("B002");
        bookId.add("B007");
        bookId.add("B004");
        bookId.add("B005");
        bookId.add("B006");
        for(String str1: bookId)
        {
            System.out.println(str1);
        }
      if(bookId.contains("B005"))
      {
          System.out.println("we have a book");
          bookId.remove("B005");
      }
      else
      {
          System.out.println("book unavialable");
      }
      for(String str1: bookId)
        {
            System.out.println(str1);
        }
      
      ArrayList<Books> library=new ArrayList<Books>();
      
      Books book1=new Books(1,"cJava",2);
      Books book2=new Books(2,"aAndroid",5);
      Books book3=new Books(3,"zSwift",7);
      Books book4=new Books(4,"bios",4);
      
      library.add(book1);
      library.add(book2);
      library.add(book3);
      library.add(book4);
      
      library.add(2,new Books(10,"database",9));
      
//      for(Books book:library)
//      {
//          book.displayInfo();
//      }
      
      System.out.println("number of books in the library:"+library.size());
      
      if(library.contains(book4))
      {
          library.remove(book4);
      }
      
      Collections.sort(library, new bookTitleComparator());
              {
                  for (Books bk:library)
                  {
                      bk.displayInfo();
                  }
              }
      
    }
    
}
