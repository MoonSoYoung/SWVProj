package selab.swv.main.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/", method = RequestMethod.GET)
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping("/")
	public String index() {
		logger.info("index ... running");
		return "index";
	}
}
