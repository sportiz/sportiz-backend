package co.sportiz.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ContextMenuController {
	
	@RequestMapping("/")
	public @ResponseBody String home() {
		return "Hello Shashank!";
	}

}
