/*

 */
package ebooksstore;

import java.math.BigDecimal;

/**
 *
 * @author Lizuca
 */
public class Technical extends Book{
    
	public Technical() {
	}
	
    public Technical(String isbn, String title, int numberOfPages, BigDecimal price, BigDecimal rating) {
        super(isbn, title, numberOfPages, price, rating);
    }
    
}
