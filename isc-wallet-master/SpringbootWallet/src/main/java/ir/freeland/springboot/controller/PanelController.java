package ir.freeland.springboot.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PanelController {
	
	@GetMapping (value ="/home")
	
	public String showHomePage() {
		return "sample1";
	}

}
