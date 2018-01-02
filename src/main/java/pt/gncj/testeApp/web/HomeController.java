package pt.gncj.testeApp.web;


import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RequestMapping("/")
@Controller
public class HomeController {
	private static final Logger logger = Logger.getLogger(HomeController.class);

	public HomeController() {
		super();
	}

	@RequestMapping(value = { "/home", "index" }, method = { RequestMethod.GET })
	public String getHome(Model model) {
		logger.log(Level.INFO, "getHome");
		return "home";
	}

}
