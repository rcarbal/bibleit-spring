package co.bibleit.bibleitspring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// this class is suppose to replicate the HomeController class
@Controller
public class SearchController {
	
	@RequestMapping("/")
	public String showPage() {
		return "word-search";
	}
	
	@RequestMapping("/processSearch")
	public String processSerch(HttpServletRequest request, Model model) {
		// read the request parameter form the HTML form
		String data = request.getParameter("search");
		
		// Create data that is being parsed 
		String result = "There is no results for " + data;

		// Add the message to the model
		model.addAttribute("result", result);
		
		return "word-search-results";
	}
	
}
