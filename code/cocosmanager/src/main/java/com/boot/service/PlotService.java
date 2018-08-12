/**
 * 
 */
package com.boot.service;


import com.boot.vo.PlotChanceVo;
import com.boot.vo.PlotVo;

import java.util.List;

/**
 * @author Administrator
 *
 */
public interface PlotService {

	List<PlotVo> getPlots();

	List<PlotChanceVo> getPlotChance();
}
