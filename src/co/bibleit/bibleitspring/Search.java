package co.bibleit.bibleitspring;

import java.util.LinkedHashMap;

// this class is suppose to duplicate the Student class in video 127
public class Search {
	
	private String search;
	private String searchType;
	
	// Collection of named value pairs
	private LinkedHashMap<String, String> searchOptions;
	
	public Search() {
		// populate search types
		searchOptions = new LinkedHashMap<>();
		searchOptions.put("exact", "Exact");
		searchOptions.put("inexact", "In-exact");
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
	
	
	
}
