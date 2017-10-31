package com.dagather.fonme.wechat.dao;

import com.dagather.fonme.wechat.model.WxHandle;
import com.dagather.fonme.wechat.model.WxHandleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public abstract interface WxHandleMapper {
	public abstract int countByExample(WxHandleExample paramWxHandleExample);

	public abstract int deleteByExample(WxHandleExample paramWxHandleExample);

	public abstract int deleteByPrimaryKey(Long paramLong);

	public abstract int insert(WxHandle paramWxHandle);

	public abstract int insertSelective(WxHandle paramWxHandle);

	public abstract List<WxHandle> selectByExampleWithRowbounds(WxHandleExample paramWxHandleExample,
			RowBounds paramRowBounds);

	public abstract List<WxHandle> selectByExample(WxHandleExample paramWxHandleExample);

	public abstract WxHandle selectByPrimaryKey(Long paramLong);

	public abstract int updateByExampleSelective(@Param("record") WxHandle paramWxHandle,
			@Param("example") WxHandleExample paramWxHandleExample);

	public abstract int updateByExample(@Param("record") WxHandle paramWxHandle,
			@Param("example") WxHandleExample paramWxHandleExample);

	public abstract int updateByPrimaryKeySelective(WxHandle paramWxHandle);

	public abstract int updateByPrimaryKey(WxHandle paramWxHandle);
}
