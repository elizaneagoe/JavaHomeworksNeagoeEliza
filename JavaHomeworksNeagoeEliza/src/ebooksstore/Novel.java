/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
