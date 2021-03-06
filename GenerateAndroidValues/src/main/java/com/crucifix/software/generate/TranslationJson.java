package com.crucifix.software.generate;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TranslationJson {

	private final String locale;
	private final String country;
	private final String string;

	@JsonCreator
	public TranslationJson(@JsonProperty("locale") final String locale, @JsonProperty("country") final String country, @JsonProperty("string") final String string) {
		super();
		this.locale = locale;
		this.country = country;
		this.string = string;
	}

	public String getLocale() {
		return locale;
	}

	public String getCountry() {
		return country;
	}

	public String getString() {
		return string;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((country == null) ? 0 : country.hashCode());
		result = (prime * result) + ((locale == null) ? 0 : locale.hashCode());
		result = (prime * result) + ((string == null) ? 0 : string.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof TranslationJson)) {
			return false;
		}
		TranslationJson other = (TranslationJson) obj;
		if (country == null) {
			if (other.country != null) {
				return false;
			}
		} else if (!country.equals(other.country)) {
			return false;
		}
		if (locale == null) {
			if (other.locale != null) {
				return false;
			}
		} else if (!locale.equals(other.locale)) {
			return false;
		}
		if (string == null) {
			if (other.string != null) {
				return false;
			}
		} else if (!string.equals(other.string)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "TranslationJson [locale=" + locale + ", country=" + country + ", string=" + string + "]";
	}

}
