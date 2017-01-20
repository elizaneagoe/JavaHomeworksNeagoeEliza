/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebooksstore;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lizuca
 */
public class BookStore implements BookManagement, BookIndex, AuthorIndex, SoldBooks {

	// we don't use the BookIndex interface because we need to use the indeBook() method 
	// that is NOT available in the BookIndex interface
	BookIndexStorage bookIndex = new BookIndexStorage();
	AuthorIndex authorIndex = new AuthorIndexStorage();
	SoldBooks soldBooks = new SoldBooksStorage();
	
	List<Book> books = new ArrayList<Book>();
	
    @Override
    public void add(Book book) {
        books.add(book);
        bookIndex.indexBook(book);
    }

    @Override
    public void delete(String isbn) {
        Book book = lookupBook(isbn);
        books.remove(book);
    }

    @Override
    public void list() {
    	System.out.println("List of books in the store");
        for (Book book : books) {
        	System.out.println(book);
        }
    }

    @Override
    public Book lookupBook(String isbn) {
        return bookIndex.lookupBook(isbn);
    }

	@Override
	public void addAuthor(Author author) {
		authorIndex.addAuthor(author);		
	}

	@Override
	public Author lookupAuthor(String name, String surname) {		
		return authorIndex.lookupAuthor(name, surname);
	}

	@Override
	public void sell(Rating rating, Book book) {
		soldBooks.sell(rating, book);		
	}

	@Override
	public void listSoldBooks() {
		soldBooks.listSoldBooks();		
	}    
}
