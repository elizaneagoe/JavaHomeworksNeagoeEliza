/*
 persistence layer
 */
package ebooksstore;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Lizuca
 */
public class BookIndexStorage implements BookIndex{
   
    // isbn -> book
    private Map< String, Book> bookIndexMap = new HashMap<String, Book>();
    
    public void indexBook(Book book) {
        bookIndexMap.put(book.getIsbn(), book);    
    }
    
    @Override
    public Book lookupBook(String isbn) {
        return bookIndexMap.get(isbn);          
    }
}

  