package com.dagather.fonme.dial.dao;

import com.dagather.fonme.dial.model.UserInfo;
import com.dagather.fonme.dial.model.UserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public abstract interface UserInfoMapper
{
  public abstract int countByExample(UserInfoExample paramUserInfoExample);
  
  public abstract int deleteByExample(UserInfoExample paramUserInfoExample);
  
  public abstract int deleteByPrimaryKey(Long paramLong);
  
  public abstract int insert(UserInfo paramUserInfo);
  
  public abstract int insertSelective(UserInfo paramUserInfo);
  
  public abstract List<UserInfo> selectByExampleWithRowbounds(UserInfoExample paramUserInfoExample, RowBounds paramRowBounds);
  
  public abstract List<UserInfo> selectByExample(UserInfoExample paramUserInfoExample);
  
  public abstract UserInfo selectByPrimaryKey(Long paramLong);
  
  public abstract int updateByExampleSelective(@Param("record") UserInfo paramUserInfo, @Param("example") UserInfoExample paramUserInfoExample);
  
  public abstract int updateByExample(@Param("record") UserInfo paramUserInfo, @Param("example") UserInfoExample paramUserInfoExample);
  
  public abstract int updateByPrimaryKeySelective(UserInfo paramUserInfo);
  
  public abstract int updateByPrimaryKey(UserInfo paramUserInfo);
}


