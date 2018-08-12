/**
 * 
 */
package com.boot.service.impl;


import com.boot.dao.MapMapper;
import com.boot.service.MapService;
import com.boot.vo.MapVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 *
 */
@Service
public class MapServiceImpl implements MapService {
	@Autowired
	private MapMapper mapMapper;

	public List<MapVo> getMapById(int mapId) {

		return mapMapper.getMapById(mapId);
    }
}
