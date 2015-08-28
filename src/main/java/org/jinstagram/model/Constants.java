package org.jinstagram.model;

import java.io.Serializable;

public final class Constants implements Serializable {
	private static final long serialVersionUID = 2077865652122476447L;

	public static final String BASE_URI = "https://api.instagram.com";

	public static final String VERSION = "v1";

	public static final String API_URL = String.format("%s/%s", BASE_URI, VERSION);

}
