/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebooksstore;

import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author Lizuca
 */
public class Rating {
    BigDecimal stars;
    int userId;
    String description;
    
    public Rating() {		
	}

    public Rating(BigDecimal stars, int userId, String description) {
        this.stars = stars;
        this.userId = userId;
        this.description = description;
    }

    public BigDecimal getStars() {
        return stars;
    }

    public int getUserId() {
        return userId;
    }

    public String getDescription() {
        return description;
    }

    public void setStars(BigDecimal stars) {
		this.stars = stars;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
    public String toString() {
        return "Rating{" + "stars=" + stars + ", userId=" + userId + ", description=" + description + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.stars);
        hash = 13 * hash + this.userId;
        hash = 13 * hash + Objects.hashCode(this.description);
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
        final Rating other = (Rating) obj;
        if (!Objects.equals(this.stars, other.stars)) {
            return false;
        }
        if (this.userId != other.userId) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
}
