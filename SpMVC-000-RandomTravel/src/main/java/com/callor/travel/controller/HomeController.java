package com.callor.travel.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.travel.models.TravelVO;
import com.callor.travel.service.TravelService;

import lombok.extern.slf4j.Slf4j;

/**
 * Handles requests for the application home page.
 */
@Slf4j
@Controller
public class HomeController {
	
	private final TravelService travelService;

	public HomeController(TravelService tarvelService) {
		
		this.travelService = tarvelService;
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		log.debug("Home");
		
		List<TravelVO> travelList = travelService.selectAll();
		model.addAttribute("TRAVEL", travelList);
		return "home";
	}
	
}
