package com.boot.web;

import com.boot.service.UserService;
import com.boot.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping
	String getUserById(int id) {
		UserVo vo=userService.getUserById(id);
		if(vo == null){
			return null;
		}
		return vo.toString();
	}

	@PostMapping
	String insertUser(UserVo userVo) {
		if(userVo == null){
			return "user info cannot be empty";
		}
		userService.insertUser(userVo);
		return "insert success";
	}

	@PostMapping
	String updateUser(UserVo userVo) {
		if(userVo == null){
			return "user info cannot be empty";
		}
		userService.updateUser(userVo);
		return "update success";
	}
}