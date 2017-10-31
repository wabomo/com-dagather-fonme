package com.dagather.fonme.wechat.dao;

import com.dagather.fonme.wechat.model.WxAuth;
import com.dagather.fonme.wechat.model.WxAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public abstract interface WxAuthMapper {
	public abstract int countByExample(WxAuthExample paramWxAuthExample);

	public abstract int deleteByExample(WxAuthExample paramWxAuthExample);

	public abstract int deleteByPrimaryKey(Long paramLong);

	public abstract int insert(WxAuth paramWxAuth);

	public abstract int insertSelective(WxAuth paramWxAuth);

	public abstract List<WxAuth> selectByExampleWithRowbounds(WxAuthExample paramWxAuthExample,
			RowBounds paramRowBounds);

	public abstract List<WxAuth> selectByExample(WxAuthExample paramWxAuthExample);

	public abstract WxAuth selectByPrimaryKey(Long paramLong);

	public abstract int updateByExampleSelective(@Param("record") WxAuth paramWxAuth,
			@Param("example") WxAuthExample paramWxAuthExample);

	public abstract int updateByExample(@Param("record") WxAuth paramWxAuth,
			@Param("example") WxAuthExample paramWxAuthExample);

	public abstract int updateByPrimaryKeySelective(WxAuth paramWxAuth);

	public abstract int updateByPrimaryKey(WxAuth paramWxAuth);
}
