package com.dagather.fonme.wechat.dao;

import com.dagather.fonme.wechat.model.WxConfigure;
import com.dagather.fonme.wechat.model.WxConfigureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public abstract interface WxConfigureMapper {
	public abstract int countByExample(WxConfigureExample paramWxConfigureExample);

	public abstract int deleteByExample(WxConfigureExample paramWxConfigureExample);

	public abstract int deleteByPrimaryKey(Long paramLong);

	public abstract int insert(WxConfigure paramWxConfigure);

	public abstract int insertSelective(WxConfigure paramWxConfigure);

	public abstract List<WxConfigure> selectByExampleWithRowbounds(WxConfigureExample paramWxConfigureExample,
			RowBounds paramRowBounds);

	public abstract List<WxConfigure> selectByExample(WxConfigureExample paramWxConfigureExample);

	public abstract WxConfigure selectByPrimaryKey(Long paramLong);

	public abstract int updateByExampleSelective(@Param("record") WxConfigure paramWxConfigure,
			@Param("example") WxConfigureExample paramWxConfigureExample);

	public abstract int updateByExample(@Param("record") WxConfigure paramWxConfigure,
			@Param("example") WxConfigureExample paramWxConfigureExample);

	public abstract int updateByPrimaryKeySelective(WxConfigure paramWxConfigure);

	public abstract int updateByPrimaryKey(WxConfigure paramWxConfigure);
}
