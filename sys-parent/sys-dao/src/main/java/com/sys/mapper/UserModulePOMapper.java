package com.sys.mapper;

import java.util.List;

import com.sys.pojo.UserModulePO;

public interface UserModulePOMapper {
	
	UserModulePO selectByPrimaryKey(Long id);
	List<UserModulePO> selectAll();
}
