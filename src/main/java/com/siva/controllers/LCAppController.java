package com.siva.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.siva.api.UserInfoDto;


@Controller
public class LCAppController {
	
	@RequestMapping("/")
	public String homepage() {
		return "Home-page";
	}
	
	@RequestMapping("/process_homepage")
	public String processHome(UserInfoDto userInfoDto,Model model) {
		
		model.addAttribute("userinfo", userInfoDto);
		return "result_page";
	}
}
