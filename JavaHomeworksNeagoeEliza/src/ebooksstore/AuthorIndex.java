/*
 persistence layer
 */
package ebooksstore;

/**
 *
 * @author Lizuca
 */
public interface AuthorIndex {
    public void addAuthor(Author author);
    public Author lookupAuthor(String name, String surname);
    
}
