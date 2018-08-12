/**
 * 
 */
package com.boot.dao;

import com.boot.vo.UserResourceVo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Administrator
 *
 */
@Mapper
public interface UserResourceMapper {
	
	public UserResourceVo getUserResourceById(int userId);
}
