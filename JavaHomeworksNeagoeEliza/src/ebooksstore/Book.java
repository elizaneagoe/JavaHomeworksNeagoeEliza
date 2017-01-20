/*
 *
 */
package ebooksstore;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lizuca
 */
public abstract class Book {
    String isbn;
    String title;
    int numberOfPages;
    BigDecimal price;
    BigDecimal rating;
    List<Author> authors = new ArrayList<>();
    
    public Book() {
    	
    }
    
    public Book(String isbn, String title, int numberOfPages, BigDecimal price, BigDecimal rating) {
        this.isbn = isbn;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.rating = rating;
    }

    public void addAuthor(Author author) {
    	authors.add(author);
    }
    
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public BigDecimal getPrice() {
        return price;
    }
    
    public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public BigDecimal getRating() {
		return rating;
	}

	public void setRating(BigDecimal rating) {
		this.rating = rating;
	}

	@Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", title=" + title + ", numberOfPages=" + numberOfPages + ", price=" + price + ", authors=" + authors + '}';
    }
    
    
}
