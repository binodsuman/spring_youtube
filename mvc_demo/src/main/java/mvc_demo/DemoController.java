package mvc_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	
	String message = "Welcome to Sprinv MVC.";
	
	@RequestMapping("/about")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, 
			defaultValue = "Binod Suman") String name) {
 
		ModelAndView mv = new ModelAndView("about");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}

}
