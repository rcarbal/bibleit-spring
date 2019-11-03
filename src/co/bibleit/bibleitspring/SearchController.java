package co.bibleit.bibleitspring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// this class is suppose to replicate the HomeController class
@Controller
public class SearchController {
	
	@RequestMapping("/")
	public String showPage() {
		return "word-search";
	}
	
	// Original arguments where HttpServletRequest request, Model model
	// HttpServletRequest being replaced by @RequestParam
	@RequestMapping("/processSearch")
	public String processSerch(
			@RequestParam("search") String searchData,
			Model model) {
		
		// Create data that is being parsed 
		String result = "There is no results for " + searchData;

		// Add the message to the model
		model.addAttribute("result", result);
		
		return "word-search-results";
	}
	
}
