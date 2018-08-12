/**
 * 
 */
package com.boot.service.impl;


import com.boot.dao.ParamMapper;
import com.boot.service.ParamService;
import com.boot.vo.ParamVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 *
 */
@Service
public class ParamServiceImpl implements ParamService {
	@Autowired
	private ParamMapper paramMapper;

	public ParamVo getResourceParam() {
        return paramMapper.getResourceParam();
    }
}
