package com.callor.travel.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.travel.models.BoardVO;
import com.callor.travel.persistance.BoardDao;
import com.callor.travel.service.BoardService;

import lombok.extern.slf4j.Slf4j;

/**
 * Handles requests for the application home page.
 */
@Slf4j
@Controller
public class HomeController {
	
	private final BoardService boardService;
	private final BoardDao boardDao;
	
	public HomeController(BoardService boardService, BoardDao boardDao) {
		super();
		this.boardService = boardService;
		this.boardDao = boardDao;
	}
	
//	@RequestMapping(value = "/", method = RequestMethod.GET) 
//	public String home(Model model) {
		
//		List<BoardVO> boList = boardDao.selectAll();
//		model.addAttribute("BO_LIST",boList);
//		return "home";
		
//	}
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		log.debug("Home");
	
		List<BoardVO> boardList = boardService.selectAll();
		model.addAttribute("BOARD", boardList);
		return "home";
}
	
}
