/**
 * 
 */
package com.boot.dao;

import org.apache.ibatis.annotations.Mapper;

import com.boot.vo.UserVo;

/**
 * @author Administrator
 *
 */
@Mapper
public interface UserMapper {
	
	public UserVo getUserById(String id);
}
