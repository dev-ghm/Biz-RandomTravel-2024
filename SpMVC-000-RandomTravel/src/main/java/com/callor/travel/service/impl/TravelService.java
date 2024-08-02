package com.callor.travel.service.impl;

import java.util.List;

import com.callor.travel.models.TravelVO;



public interface TravelService {
	
	public List<TravelVO> selectAll();
	public List<TravelVO> findAll();
	public TravelVO findById(String t_name);

}
