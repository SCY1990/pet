package com.boot.web;

import com.boot.service.UserResourceService;
import com.boot.vo.UserResourceVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userResource/{userId}")
public class UserResourceController {
	@Autowired
	private UserResourceService userResourceService;

	@GetMapping
	String getUserResourceById(@PathVariable Integer userId) {
		if(userId == null){
			return "id cannot be empty";
		}
		UserResourceVo vo=userResourceService.getUserResourceById(userId);
		if(vo == null){
			return null;
		}
		return vo.toString();
	}
}