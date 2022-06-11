package com.siva.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LCAppController {
	
	@RequestMapping("/")
	public String homepage() {
		return "Home-page";
	}
	
	@RequestMapping("/process_homepage")
	public String processHome(@RequestParam String yourname,@RequestParam String crushname,Model model) {
		
		model.addAttribute("yourname",yourname );
		model.addAttribute("crushname", crushname);
		return "result_page";
	}
}
