package org.jinstagram.entity.users.basicinfo;

import org.jinstagram.InstagramObject;

import com.google.gson.annotations.SerializedName;

public class UserInfo extends InstagramObject{
	private static final long serialVersionUID = -8972676274178378219L;
	@SerializedName("data")
	private UserInfoData data;

	public UserInfoData getData() {
		return data;
	}

	public void setData(UserInfoData data) {
		this.data = data;
	}

    @Override
    public String toString() {
        return String.format("UserInfo [data=%s]", data);
    }
}
