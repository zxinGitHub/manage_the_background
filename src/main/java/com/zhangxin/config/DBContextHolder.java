package com.zhangxin.config;

public class DBContextHolder {

	public static final String					DATA_SOURCE_ZHANGXIN_MASTER	= "zhangxinMaster";

	public static final String					DATA_SOURCE_ZHANGXIN_SLAVE		= "zhangxinSlave";

	private static final ThreadLocal<String>	CONTEXT_HOLDER				= new ThreadLocal<String>();

	/**
	 * 设置数据源类型
	 * @param dbType
	 */
	public static void setDBType(String dbType) {
		CONTEXT_HOLDER.set(dbType);
	}

	/**
	 * 获取数据源类型 
	 * @return
	 */
	public static String getDBType() {
		return CONTEXT_HOLDER.get();
	}

	/**
	 * 清除数据源类型
	 */
	public static void clearDBType() {
		CONTEXT_HOLDER.remove();
	}

}
