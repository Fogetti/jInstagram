package org.jinstagram.auth.model;

import java.io.Serializable;

import org.jinstagram.utils.Preconditions;

/**
 * Represents an OAuth verifier code.
 */
public class Verifier implements Serializable {
	private static final long serialVersionUID = 5063784683986183215L;
	private final String value;

	/**
	 * Default constructor.
	 * 
	 * @param value verifier value
	 */
	public Verifier(String value) {
		Preconditions.checkNotNull(value, "Must provide a valid string as verifier");

		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
