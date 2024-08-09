package com.callor.travel.service;

import com.callor.travel.models.UserVO;

public interface UserService {

	// 회원가입을 실행하기 위한 method
	public int join(UserVO userVO);
	
	// username 의 회원정보를 return method
	public UserVO findByid(String id);

}
