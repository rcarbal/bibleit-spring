package co.bibleit.bibleitspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// this class is suppose to replicate the HomeController class
@Controller
public class SearchController {
	
	@RequestMapping("/")
	public String showPage() {
		return "word-search";
	}
}
