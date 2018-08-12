package com.boot.web;

import com.boot.service.MapService;
import com.boot.vo.MapVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/map/{mapId}")
public class MapController {
	@Autowired
	private MapService mapService;

	@GetMapping
	String getMapById(@PathVariable Integer mapId) {

		if(mapId == null){
			return "id cannot be empty";
		}
		List<MapVo> list= mapService.getMapById(mapId);
		if(list == null || list.size() == 0){
			return null;
		}
		return list.toString();
	}

}