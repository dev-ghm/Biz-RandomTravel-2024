package com.callor.travel.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.travel.models.BoardVO;
import com.callor.travel.persistance.BoardDao;
import com.callor.travel.service.BoardService;

@Service
public class BoardServiceImplV1 implements BoardService{

	protected final BoardDao boardDao;

	public BoardServiceImplV1(BoardDao boardDao) {
		super();
		this.boardDao = boardDao;
	}

	@Override
	public List<BoardVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardVO findById(String no) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public StudentVO findById(String id) {
//
//		StudentVO studentVO = studentDao.findById(id);
//		studentVO.setSt_scores(scoreDao.findByStNum(id));
//		return studentVO;
//
//	}

}
