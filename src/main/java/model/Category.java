package model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Category {

	private String alias;
	private String title;
	
	@JsonProperty("parent_aliases")
	private List<String> parentAliases;
	
	@JsonProperty("country_whitelist")
	private List<String> countryWhiteList;
	
	@JsonProperty("country_blacklist")
	private List<String> countryBlackList;
	
	@Override
	public String toString() {
		return "Category [alias=" + alias + ", title=" + title + ", parentAliases=" + parentAliases
				+ ", countryWhiteList=" + countryWhiteList + ", countryBlackList=" + countryBlackList + "]";
	}
	
	/**
	 * @return the alias
	 */
	public String getAlias() {
		return alias;
	}
	/**
	 * @param alias the alias to set
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the parentAliases
	 */
	public List<String> getParentAliases() {
		return parentAliases;
	}
	/**
	 * @param parentAliases the parentAliases to set
	 */
	public void setParentAliases(List<String> parentAliases) {
		this.parentAliases = parentAliases;
	}
	/**
	 * @return the countryWhiteList
	 */
	public List<String> getCountryWhiteList() {
		return countryWhiteList;
	}
	/**
	 * @param countryWhiteList the countryWhiteList to set
	 */
	public void setCountryWhiteList(List<String> countryWhiteList) {
		this.countryWhiteList = countryWhiteList;
	}
	/**
	 * @return the countryBlackList
	 */
	public List<String> getCountryBlackList() {
		return countryBlackList;
	}
	/**
	 * @param countryBlackList the countryBlackList to set
	 */
	public void setCountryBlackList(List<String> countryBlackList) {
		this.countryBlackList = countryBlackList;
	}	
}
