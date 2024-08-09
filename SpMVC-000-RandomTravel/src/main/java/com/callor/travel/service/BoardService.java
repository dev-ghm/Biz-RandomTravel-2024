package com.callor.travel.service;

import java.util.List;

import com.callor.travel.models.BoardVO;



public interface BoardService {
	
	public List<BoardVO> selectAll();
	public BoardVO findById(String no);

}
