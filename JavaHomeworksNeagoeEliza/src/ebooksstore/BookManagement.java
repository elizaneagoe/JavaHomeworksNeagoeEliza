/*
 */
package ebooksstore;

/**
 *
 * @author Lizuca
 */
public interface BookManagement {
    public void add (Book book);
    public void delete (String isbn);
    public void list();
}
