package org.jinstagram.entity.common;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Videos implements Serializable {

	private static final long serialVersionUID = 6430474555283489048L;


	@SerializedName("low_resolution")
	private VideoData lowResolution;


	@SerializedName("standard_resolution")
	private VideoData standardResolution;
	
	
	public VideoData getLowResolution() {
		return lowResolution;
	}

	public void setLowResolution(VideoData lowResolution) {
		this.lowResolution = lowResolution;
	}

	public VideoData getStandardResolution() {
		return standardResolution;
	}

	public void setStandardResolution(VideoData standardResolution) {
		this.standardResolution = standardResolution;
	}
	
    @Override
    public String toString() {
        return String.format("Videos [lowResolution=%s, standardResolution=%s]",
                lowResolution, standardResolution);
    }
}
