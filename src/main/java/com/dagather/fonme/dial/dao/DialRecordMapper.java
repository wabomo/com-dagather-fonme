package com.dagather.fonme.dial.dao;

import com.dagather.fonme.dial.model.DialRecord;
import com.dagather.fonme.dial.model.DialRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public abstract interface DialRecordMapper {
	public abstract int countByExample(DialRecordExample paramDialRecordExample);

	public abstract int deleteByExample(DialRecordExample paramDialRecordExample);

	public abstract int deleteByPrimaryKey(String paramString);

	public abstract int insert(DialRecord paramDialRecord);

	public abstract int insertSelective(DialRecord paramDialRecord);

	public abstract List<DialRecord> selectByExampleWithRowbounds(DialRecordExample paramDialRecordExample,
			RowBounds paramRowBounds);

	public abstract List<DialRecord> selectByExample(DialRecordExample paramDialRecordExample);

	public abstract DialRecord selectByPrimaryKey(String paramString);

	public abstract int updateByExampleSelective(@Param("record") DialRecord paramDialRecord,
			@Param("example") DialRecordExample paramDialRecordExample);

	public abstract int updateByExample(@Param("record") DialRecord paramDialRecord,
			@Param("example") DialRecordExample paramDialRecordExample);

	public abstract int updateByPrimaryKeySelective(DialRecord paramDialRecord);

	public abstract int updateByPrimaryKey(DialRecord paramDialRecord);
}
