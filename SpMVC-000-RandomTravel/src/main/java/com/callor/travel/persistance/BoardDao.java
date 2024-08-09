package com.callor.travel.persistance;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.callor.travel.models.BoardVO;

public interface BoardDao {

	@Select("SELECT * FROM board ORDER BY no")
	public List<BoardVO> selectAll();
	
	@Select("SELECT * FROM board WHERE no =#{no}")
	public BoardVO findById(String no);

	@Select("SELECT * FROM board WHERE writer = #{writer}")
	public List<BoardVO> findByName(String writer);
	
	public int insert(BoardVO boVO);
	public int update(BoardVO boVO);

	@Delete("DELETE FROM board WHERE no = #{no}")
	public int delete(String no);
}
