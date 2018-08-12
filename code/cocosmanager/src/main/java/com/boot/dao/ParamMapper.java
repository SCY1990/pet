/**
 * 
 */
package com.boot.dao;

import com.boot.vo.ParamVo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Administrator
 *
 */
@Mapper
public interface ParamMapper {
	
	public ParamVo getResourceParam();
}
