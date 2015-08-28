package org.jinstagram;

import java.io.Serializable;

import org.jinstagram.model.Constants;

public class InstagramConfig implements Serializable {

	private static final long serialVersionUID = 829807885256070473L;
	private String baseURI;
	private String version;
	private String apiURL;
	private int connectionTimeoutMills = 0;
	private int readTimeoutMills = 0;

	public InstagramConfig() {
		baseURI = Constants.BASE_URI;
		version = Constants.VERSION;
		apiURL = Constants.API_URL;
	}

	public String getBaseURI() {
		return baseURI;
	}

	public void setBaseURI(String baseURI) {
		this.baseURI = baseURI;
		apiURL = String.format("%s/%s", baseURI, version);
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
		apiURL = String.format("%s/%s", baseURI, version);
	}

	public String getApiURL() {
		return apiURL;
	}

	public int getConnectionTimeoutMills() {
		return connectionTimeoutMills;
	}

	public void setConnectionTimeoutMills(int connectionTimeoutMills) {
		this.connectionTimeoutMills = connectionTimeoutMills;
	}

	public int getReadTimeoutMills() {
		return readTimeoutMills;
	}

	public void setReadTimeoutMills(int readTimeoutMills) {
		this.readTimeoutMills = readTimeoutMills;
	}
}
