package com.boot.web;

import com.boot.service.ParamService;
import com.boot.vo.ParamVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/param")
public class ParamController {
	@Autowired
	private ParamService paramService;

	@GetMapping("/")
	String getResourceParam() {

		ParamVo param = paramService.getResourceParam();
		return param.toString();
	}

}