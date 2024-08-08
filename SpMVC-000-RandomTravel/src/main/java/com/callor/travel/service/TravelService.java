package com.callor.travel.service;

import java.util.List;

import com.callor.travel.models.TravelVO;



public interface TravelService {
	
	public List<TravelVO> selectAll();
	public TravelVO findById(String t_name);

}
