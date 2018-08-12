/**
 * 
 */
package com.boot.service;


import com.boot.vo.UserVo;

/**
 * @author Administrator
 *
 */
public interface UserService {

	UserVo getUserById(int id);

	int insertUser(UserVo userVo);

	int updateUser(UserVo userVo);
}
