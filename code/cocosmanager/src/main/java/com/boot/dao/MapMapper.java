/**
 * 
 */
package com.boot.dao;

import com.boot.vo.MapVo;
import com.boot.vo.UserMapVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Administrator
 *
 */
@Mapper
public interface MapMapper {
	
	List<MapVo> getMapById(int mapId);

	UserMapVo getUserMapByUseId(int userId);
}
