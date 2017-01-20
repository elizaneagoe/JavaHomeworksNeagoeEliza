/*
 Business layer
 */
package ebooksstore;

import java.math.BigDecimal;

/**
 *
 * @author Lizuca
 */
public class ArtAlbum extends Book{
    
	public ArtAlbum() {		
	}
	
    public ArtAlbum(String isbn, String title, int numberOfPages, BigDecimal price, BigDecimal rating) {
        super(isbn, title, numberOfPages, price, rating);
    }
    
}
