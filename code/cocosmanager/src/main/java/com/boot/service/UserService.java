/**
 * 
 */
package com.boot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.UserMapper;
import com.boot.vo.UserVo;

/**
 * @author Administrator
 *
 */
@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public UserVo getUserById(String id) {
        return userMapper.getUserById(id);
    }
}
