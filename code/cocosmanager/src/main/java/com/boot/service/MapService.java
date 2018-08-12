/**
 * 
 */
package com.boot.service;


import com.boot.vo.MapVo;
import com.boot.vo.UserMapVo;

import java.util.List;

/**
 * @author Administrator
 *
 */
public interface MapService {

	List<MapVo> getMapById(int mapId);

	UserMapVo getUserMapByUseId(int userId);
}
