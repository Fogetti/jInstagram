package org.jinstagram.entity.common;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Likes implements Serializable {
	private static final long serialVersionUID = -8685239322107986675L;

	@SerializedName("count")
	private int count;

	@SerializedName("data")
	private List<User> likesUserList;

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	public List<User> getLikesUserList() {
		return likesUserList;
	}

	public void setLikesUserList(List<User> likesUserList) {
		this.likesUserList = likesUserList;
	}

    @Override
    public String toString() {
        return String.format("Likes [count=%s, likesUserList=%s]", count, likesUserList);
    }
}
