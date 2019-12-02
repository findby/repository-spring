package com.sys.mapper;

import com.sys.pojo.UserInfoPO;
import com.sys.pojo.UserInfoPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoPOMapper {
    long countByExample(UserInfoPOExample example);

    int deleteByExample(UserInfoPOExample example);

    int deleteByPrimaryKey(Integer testUserUid);

    int insert(UserInfoPO record);

    int insertSelective(UserInfoPO record);

    List<UserInfoPO> selectByExampleWithBLOBs(UserInfoPOExample example);

    List<UserInfoPO> selectByExample(UserInfoPOExample example);

    UserInfoPO selectByPrimaryKey(Integer testUserUid);

    int updateByExampleSelective(@Param("record") UserInfoPO record, @Param("example") UserInfoPOExample example);

    int updateByExampleWithBLOBs(@Param("record") UserInfoPO record, @Param("example") UserInfoPOExample example);

    int updateByExample(@Param("record") UserInfoPO record, @Param("example") UserInfoPOExample example);

    int updateByPrimaryKeySelective(UserInfoPO record);

    int updateByPrimaryKeyWithBLOBs(UserInfoPO record);

    int updateByPrimaryKey(UserInfoPO record);
}