package com.sys.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.alibaba.dubbo.config.annotation.Service;
import com.sys.mapper.UserModulePOMapper;
import com.sys.pojo.UserModulePO;
import com.sys.user.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserModulePOMapper userModulePOMapper;
	
	@Override
	public List<UserModulePO> findUserList() {
		return userModulePOMapper.selectAll();
	}

}
