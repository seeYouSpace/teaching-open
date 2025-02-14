package org.jeecg.common.constant;

/**
 * @author: huangxutao
 * @date: 2019-06-14
 * @description: 缓存常量
 */
public interface CacheConstant {
	// Scratch
	public static final String SCRATCH_CLOUD = "scratch:cloud:";
	public static final String SCRATCH_BACKPACK_LIST = "scratch:backpackList:";
	public static final String SCRATCH_BACKPACK_BODY = "scratch:backpackBody:";

	/**
	 * 字典信息缓存
	 */
    public static final String SYS_DICT_CACHE = "sys:cache:dict";
	/**
	 * 表字典信息缓存
	 */
    public static final String SYS_DICT_TABLE_CACHE = "sys:cache:dictTable";

	/**
	 * 数据权限配置缓存
	 */
    public static final String SYS_DATA_PERMISSIONS_CACHE = "sys:cache:permission:datarules";

    //菜单缓存
    public static final String TEACHING_MENU_CACHE = "sys:cache:teaching:menu";

	/**
	 * 缓存用户信息
	 */
	public static final String SYS_USERS_CACHE = "sys:cache:user";

	/**
	 * 全部部门信息缓存
	 */
	public static final String SYS_DEPARTS_CACHE = "sys:cache:depart:alldata";


	/**
	 * 全部部门ids缓存
	 */
	public static final String SYS_DEPART_IDS_CACHE = "sys:cache:depart:allids";


	/**
	 * 测试缓存key
	 */
	public static final String TEST_DEMO_CACHE = "test:demo";

	/**
	 * 字典信息缓存
	 */
	public static final String SYS_DYNAMICDB_CACHE = "sys:cache:dbconnect:dynamic:";

}
