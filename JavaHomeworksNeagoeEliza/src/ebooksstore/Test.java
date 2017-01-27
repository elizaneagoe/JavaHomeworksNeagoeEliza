/*
 
 */
package ebooksstore;

import java.math.BigDecimal;

/**
 *
 * @author Lizuca
 */
public class Test {
    
      public static void main(String[] args) {
          
          // Author class
    Author author2 = new Author("Cezar", "Petrescu");
    author2.code = 25;
    System.out.println(author2);
    
    //AuthorIndex
    AuthorIndex authors = new AuthorIndexStorage();
        String name = "El";
        String surname = "Neagoe";
        Author author1 = new Author (name, surname);
        authors.addAuthor(author1);
        Author foundAuthor = authors.lookupAuthor(name, surname);
        System.out.println(foundAuthor.equals(author1));
        
        // BookIndexStorage
         BookIndexStorage bookIndex = new BookIndexStorage();
        Book book1 = new Novel();
        book1.isbn = "125-229";
        book1.numberOfPages = 250;
        book1.title = "Fram Ursul Polar";
        BigDecimal price1 = new BigDecimal (25);
        book1.price = price1;
        BigDecimal rating1 = new BigDecimal(2.5);
        book1.rating = rating1;
        
        bookIndex.indexBook(book1);
        Book book2 = bookIndex.lookupBook(book1.getIsbn());
        System.out.println(book1.getIsbn());
       
      }
}
