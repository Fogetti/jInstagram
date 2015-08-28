package org.jinstagram.entity.common;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class GridPosition implements Serializable {

	private static final long serialVersionUID = -2385272401144546120L;

	@SerializedName("x")
	private double x;

	@SerializedName("y")
	private double y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

}
