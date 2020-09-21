package com.cts.employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin
public class EmployeeController {
	
	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("name", "Ozvitha Fernz");
		return "index";
	}

}
