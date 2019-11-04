package co.bibleit.bibleitspring;


import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

// this class is suppose to replicate the HomeController class
// Add parent mapping
@Controller
@RequestMapping("/search")
public class SearchController {
	@Value("#{loginOptions}")
	private Map<String, String> loginOptions;
	
	
	@RequestMapping("/wordSearch")
	public String showPage(Model theModel) {
		
		// Create the search object
		Search theSearch = new Search();
		
		// add the search object to the model
		theModel.addAttribute("search", theSearch);
		
		// add the login options
		theModel.addAttribute("theLoginOptions", loginOptions);
		
		return "word-search";
	}
	
	// Original arguments where HttpServletRequest request, Model model
	// HttpServletRequest being replaced by @RequestParam
	@RequestMapping("/processSearch")
	public String processSerch(@ModelAttribute("search") Search searchData, Model theModel) {
		
		System.out.println(searchData.getSearch() + " Was sent by the search input");
		
		// add the login options
		theModel.addAttribute("theLoginOptions", loginOptions);
		
		return "word-search-results";
	}
	
}
