package org.jinstagram.entity.common;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * A class to denote users_in_photo json data.
 * 
 e.x. 
 
 "users_in_photo": [{
            "user": {
                "username": "kevin",
                "full_name": "Kevin S",
                "id": "3",
                "profile_picture": "..."
            },
            "position": {
                "x": 0.315,
                "y": 0.9111
            }
        }],
        
        
 * @author Sachin Handiekar
 * @since 1.1.10
 */
public class UsersInPhoto implements Serializable {

	private static final long serialVersionUID = -5667721230308724048L;

	@SerializedName("user")
	private User user;

	@SerializedName("position")
	private GridPosition position;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public GridPosition getPosition() {
		return position;
	}

	public void setPosition(GridPosition position) {
		this.position = position;
	}

}
