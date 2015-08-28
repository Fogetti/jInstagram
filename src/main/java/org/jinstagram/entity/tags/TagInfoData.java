package org.jinstagram.entity.tags;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class TagInfoData implements Serializable {
	private static final long serialVersionUID = -7361774689983950074L;

	@SerializedName("media_count")
	private long mediaCount;

	@SerializedName("name")
	private String tagName;

	/**
	 * @return the mediaCount
	 */
	public long getMediaCount() {
		return mediaCount;
	}

	/**
	 * @param mediaCount the mediaCount to set
	 */
	public void setMediaCount(long mediaCount) {
		this.mediaCount = mediaCount;
	}

	/**
	 * @return the tagName
	 */
	public String getTagName() {
		return tagName;
	}

	/**
	 * @param tagName the tagName to set
	 */
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

    @Override
    public String toString() {
        return String.format("TagInfoData [mediaCount=%s, tagName=%s]", mediaCount, tagName);
    }
}
