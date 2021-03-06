/*

 */
package ebooksstore;


/**
 *
 * @author Lizuca
 */
public interface SoldBooks {
    /**
     * Registers a book as sold with the specified rating
     * 
     * @param rating The rating of the sold book
     * @param book the book that was sold
     */
    public void sell( Rating rating, Book book);
    public void listSoldBooks();
}
