/*
 *
 */
package ebooksstore;

import java.util.Objects;

/**
 *
 * @author Lizuca
 */
public class Name {
    String name;
    String surname;

    Name(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.name);
        hash = 31 * hash + Objects.hashCode(this.surname);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Name other = (Name) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        return true;
    }
    
    
}
