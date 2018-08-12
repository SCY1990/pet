package com.boot.web;

import com.boot.service.MapService;
import com.boot.vo.MapVo;
import com.boot.vo.UserMapVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/map/{userId}")
public class MapController {
	@Autowired
	private MapService mapService;

	@GetMapping
	String getUserMapByUserId(@PathVariable Integer userId) {

		if(userId == null){
			return "userId cannot be empty";
		}
		UserMapVo vo = mapService.getUserMapByUseId(userId);
		if(vo == null){
			return null;
		}
		List<MapVo> list= mapService.getMapById(vo.getMapId());
		if(list == null || list.size() == 0){
			return null;
		}
		return list.toString();
	}
}