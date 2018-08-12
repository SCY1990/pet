package com.boot.web;

import com.boot.service.PlotService;
import com.boot.vo.PlotVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/plot")
public class PlotController {
	@Autowired
	private PlotService plotService;

	@GetMapping
	String getPlots() {

		List<PlotVo> list= plotService.getPlots();
		if(list == null || list.size() == 0){
			return null;
		}
		return list.toString();
	}

}