package com.sys.user.service;

import java.util.List;

import com.sys.pojo.UserModulePO;

public interface UserService {
	/***
	 * 查询所有用户的信息
	 * @return
	 */
	List<UserModulePO> findUserList();
}
