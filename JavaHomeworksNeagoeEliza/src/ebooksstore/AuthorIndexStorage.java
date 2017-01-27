/*
 
 */
package ebooksstore;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Lizuca
 */
public class AuthorIndexStorage implements AuthorIndex{

    // Name -> Author
    private Map<Name,Author> authorsIndexMap = new HashMap<Name,Author>();
     
    @Override
    public void addAuthor(Author author) {
        Name nameOfAuthor = new Name(author.getName(), author.getSurname());
        authorsIndexMap.put(nameOfAuthor, author);
        author.setCode(authorsIndexMap.size());
    }

    @Override
    public Author lookupAuthor(String name, String surname) {
       return authorsIndexMap.get(new Name(name, surname));
    }
}
