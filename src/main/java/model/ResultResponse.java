package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultResponse {

	private String code;

	@JsonProperty("short_link")
	private String shortLink;
	
	@JsonProperty("original_link")
	private String originalLink;

	public String getShortLink() {
		return shortLink;
	}

	public void setShortLink(String shortLink) {
		this.shortLink = shortLink;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getOriginalLink() {
		return originalLink;
	}

	public void setOriginalLink(String originalLink) {
		this.originalLink = originalLink;
	}

	@Override
	public String toString() {
		return "ResultResponse [code=" + code + ", shortLink=" + shortLink + ", originalLink=" + originalLink + "]";
	}

	
}
