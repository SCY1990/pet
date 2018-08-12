/**
 * 
 */
package com.boot.service.impl;


import com.boot.dao.UserResourceMapper;
import com.boot.service.UserResourceService;
import com.boot.vo.UserResourceVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 *
 */
@Service
public class UserResourceServiceImpl implements UserResourceService {
	@Autowired
	private UserResourceMapper userResourceMapper;

	public UserResourceVo getUserResourceById(int userId){
        return userResourceMapper.getUserResourceById(userId);
    }
}
