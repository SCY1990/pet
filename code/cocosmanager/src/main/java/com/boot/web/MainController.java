package com.boot.web;

import com.boot.service.UserService;
import com.boot.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@EnableAutoConfiguration
public class MainController {
	@Autowired
	private UserService userService;
	// @RequestMapping("")
	// public String index(){
	// return "examples/index";
	// }
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!";
	}

	@GetMapping("/html")
	String html() {
		return "/index.html";
	}

//	@RequestMapping(value="/getUserById",produces="text/plain;charset=UTF-8")
	@RequestMapping("/user")
	@ResponseBody
	String getUserById(HttpServletRequest request, HttpServletResponse response) {
		UserVo vo=userService.getUserById(request.getParameter("uid"));
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
//		response.setHeader("contentType", "text/html; charset=utf-8");
//		response.setContentType("text/html;charset=utf-8");
		System.out.println(vo.toString());
		return vo.toString();
	}
}