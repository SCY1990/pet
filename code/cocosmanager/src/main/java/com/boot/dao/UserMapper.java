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
	
	UserVo getUserById(int id);

	int insertUser(UserVo userVo);

	int updateUser(UserVo userVo);
}
