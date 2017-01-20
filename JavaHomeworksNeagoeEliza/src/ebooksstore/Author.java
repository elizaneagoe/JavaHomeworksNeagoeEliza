/*
 
 */
package ebooksstore;

import java.util.Objects;

/**
 *
 * @author Lizuca
 */
public class Author {
    int code;
    String name;
    String surname;

    Author(String name, String surname) {
        this.name = name;
        this.surname = surname;        
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setCode(int code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.surname);
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
        final Author other = (Author) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        return true;
    }
    
	@Override
    public String toString() {
        return "Author{" + "name=" + name + ", surname=" + surname + ", code=" + code + '}';
    }
    
}
