package com.InventoryManegement.orii.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TopPageController {
	
	@RequestMapping("/toppage")
	public ModelAndView toppage(ModelAndView mav) {
		mav.setViewName("/toppage/toppage");
		return mav;
	}
}
