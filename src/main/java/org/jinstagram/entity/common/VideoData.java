package org.jinstagram.entity.common;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class VideoData implements Serializable {

	private static final long serialVersionUID = -2697592416992589884L;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@SerializedName("url")
	private String url;

	@SerializedName("width")
	private int width;

	@SerializedName("height")
	private int height;
	
    @Override
    public String toString() {
        return String.format("VideoData [videoWidth=%i, videoHeight=%i, videoUrl=%s]",
                width, height, url);
    }
}
