/**
 * 
 */
package com.boot.service;


import com.boot.vo.MapVo;

import java.util.List;

/**
 * @author Administrator
 *
 */
public interface MapService {

	List<MapVo> getMapById(int mapId);
}
