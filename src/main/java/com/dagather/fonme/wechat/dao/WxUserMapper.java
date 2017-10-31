package com.dagather.fonme.wechat.dao;

import com.dagather.fonme.wechat.model.WxUser;
import com.dagather.fonme.wechat.model.WxUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public abstract interface WxUserMapper {
	public abstract int countByExample(WxUserExample paramWxUserExample);

	public abstract int deleteByExample(WxUserExample paramWxUserExample);

	public abstract int deleteByPrimaryKey(Long paramLong);

	public abstract int insert(WxUser paramWxUser);

	public abstract int insertSelective(WxUser paramWxUser);

	public abstract List<WxUser> selectByExampleWithRowbounds(WxUserExample paramWxUserExample,
			RowBounds paramRowBounds);

	public abstract List<WxUser> selectByExample(WxUserExample paramWxUserExample);

	public abstract WxUser selectByPrimaryKey(Long paramLong);

	public abstract int updateByExampleSelective(@Param("record") WxUser paramWxUser,
			@Param("example") WxUserExample paramWxUserExample);

	public abstract int updateByExample(@Param("record") WxUser paramWxUser,
			@Param("example") WxUserExample paramWxUserExample);

	public abstract int updateByPrimaryKeySelective(WxUser paramWxUser);

	public abstract int updateByPrimaryKey(WxUser paramWxUser);
}
