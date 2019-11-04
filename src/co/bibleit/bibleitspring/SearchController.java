package co.bibleit.bibleitspring;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

// this class is suppose to replicate the HomeController class
// Add parent mapping
@Controller
@RequestMapping("/search")
public class SearchController {
	
	@RequestMapping("/wordSearch")
	public String showPage(Model theModel) {
		
		// Create the search object
		Search theSearch = new Search();
		
		// add the search object to the model
		theModel.addAttribute("search", theSearch);
		
		return "word-search";
	}
	
	// Original arguments where HttpServletRequest request, Model model
	// HttpServletRequest being replaced by @RequestParam
	@RequestMapping("/processSearch")
	public String processSerch(@ModelAttribute("search") Search searchData) {
		
		System.out.println(searchData.getSearch() + " Was sent by the search input");
		
		return "word-search-results";
	}
	
}
