package com.callor.travel.persistance;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.callor.travel.models.UserVO;

public interface UserDao {
	@Select("SELECT * FROM user")
	public List<UserVO> selectAll();
	
	@Select("SELECT * FROM user WHERE id = #{id}")
	public UserVO findByid(String id);
	
	public int insert(UserVO userVO);
}
