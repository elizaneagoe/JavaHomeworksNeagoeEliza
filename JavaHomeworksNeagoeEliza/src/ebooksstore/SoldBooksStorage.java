/*

 */
package ebooksstore;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Lizuca
 */
public class SoldBooksStorage implements SoldBooks{
    
    private Map<Rating, Book> soldBooksMap = new HashMap<Rating, Book>();
 
    @Override
    public void sell(Rating rating, Book book) {
       soldBooksMap.put(rating, book);       
    }

    @Override
    public void listSoldBooks() {
        Set<Rating> ratings = soldBooksMap.keySet();
        for (Rating rating : ratings) {
            Book book = soldBooksMap.get(rating);
            System.out.println(rating + " : " + book);
        }
    }       
}
