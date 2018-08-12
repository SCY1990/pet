package com.boot.web;

import com.boot.service.MapService;
import com.boot.vo.MapVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/map")
public class MapController {
	@Autowired
	private MapService mapService;

	@GetMapping
	String getMapById(int mapId) {

		List<MapVo> list= mapService.getMapById(mapId);
		if(list == null || list.size() == 0){
			return null;
		}
		return list.toString();
	}

}