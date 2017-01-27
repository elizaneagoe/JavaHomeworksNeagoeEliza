/*
 
 */
package ebooksstore;

import java.math.BigDecimal;

/**
 *
 * @author Lizuca
 */
public class Novel extends Book {
	
	public Novel() {
		
	}
	
    public Novel(String isbn, String title, int numberOfPages, BigDecimal price, BigDecimal rating) {
        super(isbn, title, numberOfPages, price, rating);
    }  
}
