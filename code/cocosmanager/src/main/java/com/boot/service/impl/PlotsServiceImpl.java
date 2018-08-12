/**
 * 
 */
package com.boot.service.impl;


import com.boot.dao.PlotMapper;
import com.boot.service.PlotService;
import com.boot.vo.PlotChanceVo;
import com.boot.vo.PlotVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 *
 */
@Service
public class PlotsServiceImpl implements PlotService {
	@Autowired
	private PlotMapper plotMapper;

	public List<PlotVo> getPlots() {

		return plotMapper.getPlots();
    }

	public List<PlotChanceVo> getPlotChance(){
		return plotMapper.getPlotChance();
	}
}
