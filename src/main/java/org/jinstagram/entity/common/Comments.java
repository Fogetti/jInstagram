package org.jinstagram.entity.common;

import java.io.Serializable;
import java.util.List;

import org.jinstagram.entity.comments.CommentData;

import com.google.gson.annotations.SerializedName;

public class Comments implements Serializable {
	private static final long serialVersionUID = -3474853223933053271L;

	@SerializedName("data")
	private List<CommentData> comments;

	@SerializedName("count")
	private int count;

	public List<CommentData> getComments() {
		return comments;
	}

	public void setComments(List<CommentData> comments) {
		this.comments = comments;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

    @Override
    public String toString() {
        return String.format("Comments [comments=%s, count=%s]", comments, count);
    }
}
