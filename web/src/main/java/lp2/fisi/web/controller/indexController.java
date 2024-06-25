package lp2.fisi.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class indexController {
	@GetMapping("/index")
	public String Home(Model model) {
		return "index";		
	}
}

