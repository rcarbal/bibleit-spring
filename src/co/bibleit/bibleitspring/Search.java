package co.bibleit.bibleitspring;

import java.util.LinkedHashMap;


// this class is suppose to duplicate the Student class in video 127
public class Search {
	
	private String search;
	private String searchType;	
	private LinkedHashMap<String, String> searchOptions;
	private LinkedHashMap<String, String> languageOptions;
	private String language;
	
	public Search() {
		// populate search types
		searchOptions = new LinkedHashMap<>();
		searchOptions.put("exact", "Exact");
		searchOptions.put("inexact", "In-exact");
		
		// populate language options
		languageOptions = new LinkedHashMap<>();
		languageOptions.put("english", "English");
		languageOptions.put("spanish", "Spanish");
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public LinkedHashMap<String, String> getSearchOptions() {
		return searchOptions;
	}

	public void setSearchOptions(LinkedHashMap<String, String> searchOptions) {
		this.searchOptions = searchOptions;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public LinkedHashMap<String, String> getLanguageOptions() {
		return languageOptions;
	}

	public void setLanguageOptions(LinkedHashMap<String, String> languageOptions) {
		this.languageOptions = languageOptions;
	}
	
		
}
