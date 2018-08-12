package com.boot.web;

import com.boot.service.UserService;
import com.boot.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/{id}")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping
	String getUserById(@PathVariable Integer id) {
	    if(id == null){
            return "id cannot be empty";
        }
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

	@PutMapping
	String updateUser(UserVo userVo) {
		if(userVo == null){
			return "user info cannot be empty";
		}
		userService.updateUser(userVo);
		return "update success";
	}
}