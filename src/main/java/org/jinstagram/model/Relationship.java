package org.jinstagram.model;

import java.io.Serializable;

public enum Relationship implements Serializable {
	FOLLOW, UNFOLLOW, BLOCK, UNBLOCK, APPROVE, DENY;

	@Override
	public String toString() {
		return super.toString().toLowerCase();
	}
}
