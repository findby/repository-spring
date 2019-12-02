package com.sys.mapper;

import com.sys.pojo.UserModulePO;
import com.sys.pojo.UserModulePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserModulePOMapper {
    long countByExample(UserModulePOExample example);

    int deleteByExample(UserModulePOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserModulePO record);

    int insertSelective(UserModulePO record);

    List<UserModulePO> selectByExample(UserModulePOExample example);

    UserModulePO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserModulePO record, @Param("example") UserModulePOExample example);

    int updateByExample(@Param("record") UserModulePO record, @Param("example") UserModulePOExample example);

    int updateByPrimaryKeySelective(UserModulePO record);

    int updateByPrimaryKey(UserModulePO record);
}