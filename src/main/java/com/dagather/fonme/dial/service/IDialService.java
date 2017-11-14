package com.dagather.fonme.dial.service;

import com.dagather.fonme.dial.model.DialRecord;
import com.dagather.fonme.dial.model.UserInfo;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public abstract interface IDialService {
	public abstract String sendDial(String paramString1, String paramString2);

	public abstract UserInfo selectUserInfoObject(String paramString, Long paramLong, Integer paramInteger);

	public abstract boolean insertDialRecordObject(DialRecord paramDialRecord) throws SQLException;


	/**
	 * 按条件查询话单
	 *
	 * @param paramMap bindUUId	String	可选	客户生成的唯一标示，默认为空（对应回拨返回的session）
	 *                 startTime	String	可选	开始查询时间，时间格式：yyyy-MM-dd HH:mm:ss，默认为空
	 *                 endTime	String	可选	结束查询时间，时间格式：yyyy-MM-dd HH:mm:ss，开始时间与结束时间不允许跨月查询，默认为空
	 *                 pageId	int	可选	当前查询页码，默认为1
	 *                 pageRows	int	可选	每页显示条数，默认20，最大值 20
	 *                 caller	String	可选	主叫号码，必须为11位手机号
	 *                 callee	String	可选	被叫号码，必须为11位手机号
	 * @return json
	 */
	String getCallInfoListBy(Map<String, String> paramMap);

	/**
	 * 查询未消计算费用的成功拨号记录(flag_enable=0)
	 *
	 * @param batchSize 记录数量
	 * @return
	 */
	List<DialRecord> selectDialListUnCalculated(int batchSize);

	/**
	 * 修改记录状态 为 计费处理中(0待处理、100处理中、1处理结束、-1数据异常)
	 * @param sessionid
	 * @return
	 */
	boolean updateStatusFromWaitToIng(String... sessionid);

	/**
	 * 修改记录状态 为 计费处理结束(0待处理、100处理中、1处理结束、-1数据异常)
	 * @param sessionid
	 * @return
	 */
	boolean updateStatusFromIngToDone(String... sessionid);

	/**
	 * 修改记录状态 为 数据异常(0待处理、100处理中、1处理结束、-1数据异常)
	 * @param errid
	 * @param sessionid
	 * @return
	 */
	boolean updateStatusFromWaitToErr(Integer errid, String... sessionid);

	/**
	 * 修改待处理记录的更新时间
	 * @param sessionid
	 * @return
	 */
	boolean updateUpdateTimeIfWait(String... sessionid);

	/**
	 * 根据用户号码查询用户记录
	 * @param phone
	 * @return
	 */
	UserInfo selectUserInfoByPhone(String phone);

	/**
	 * 计算通话费用的预处理
	 * @param yesSessionidArr
	 * @param noSessionidArr
	 */
    void updateDialRecordPretreatmentForCalc(String[] yesSessionidArr, String[] noSessionidArr);
}
