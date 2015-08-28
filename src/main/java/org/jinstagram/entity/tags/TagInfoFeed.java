package org.jinstagram.entity.tags;

import org.jinstagram.InstagramObject;
import org.jinstagram.entity.common.Meta;

import com.google.gson.annotations.SerializedName;

public class TagInfoFeed extends InstagramObject{
	private static final long serialVersionUID = 4064653320714118646L;

	@SerializedName("meta")
	private Meta meta;

	@SerializedName("data")
	private TagInfoData tagInfo;

	/**
	 * @return the meta
	 */
	public Meta getMeta() {
		return meta;
	}

	/**
	 * @param meta the meta to set
	 */
	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	public TagInfoData getTagInfo() {
		return tagInfo;
	}

	public void setTagInfo(TagInfoData tagInfo) {
		this.tagInfo = tagInfo;
	}

    @Override
    public String toString() {
        return String.format("TagInfoFeed [meta=%s, tagInfo=%s]", meta, tagInfo);
    }
}
