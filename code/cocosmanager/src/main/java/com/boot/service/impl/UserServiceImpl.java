/**
 * 
 */
package com.boot.service.impl;


import com.boot.dao.UserMapper;
import com.boot.service.UserService;
import com.boot.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 *
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	public UserVo getUserById(String id) {
        return userMapper.getUserById(id);
    }
}
