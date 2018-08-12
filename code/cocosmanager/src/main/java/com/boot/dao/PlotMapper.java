/**
 * 
 */
package com.boot.dao;

import com.boot.vo.PlotChanceVo;
import com.boot.vo.PlotVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Administrator
 *
 */
@Mapper
public interface PlotMapper {
	
	List<PlotVo> getPlots();

	List<PlotChanceVo> getPlotChance();
}
