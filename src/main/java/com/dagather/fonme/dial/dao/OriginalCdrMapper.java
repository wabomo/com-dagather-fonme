package com.dagather.fonme.dial.dao;

import com.dagather.fonme.dial.model.OriginalCdr;
import com.dagather.fonme.dial.model.OriginalCdrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public abstract interface OriginalCdrMapper
{
  public abstract int countByExample(OriginalCdrExample paramOriginalCdrExample);
  
  public abstract int deleteByExample(OriginalCdrExample paramOriginalCdrExample);
  
  public abstract int deleteByPrimaryKey(String paramString);
  
  public abstract int insert(OriginalCdr paramOriginalCdr);
  
  public abstract int insertSelective(OriginalCdr paramOriginalCdr);
  
  public abstract List<OriginalCdr> selectByExampleWithRowbounds(OriginalCdrExample paramOriginalCdrExample, RowBounds paramRowBounds);
  
  public abstract List<OriginalCdr> selectByExample(OriginalCdrExample paramOriginalCdrExample);
  
  public abstract OriginalCdr selectByPrimaryKey(String paramString);
  
  public abstract int updateByExampleSelective(@Param("record") OriginalCdr paramOriginalCdr, @Param("example") OriginalCdrExample paramOriginalCdrExample);
  
  public abstract int updateByExample(@Param("record") OriginalCdr paramOriginalCdr, @Param("example") OriginalCdrExample paramOriginalCdrExample);
  
  public abstract int updateByPrimaryKeySelective(OriginalCdr paramOriginalCdr);
  
  public abstract int updateByPrimaryKey(OriginalCdr paramOriginalCdr);
}


