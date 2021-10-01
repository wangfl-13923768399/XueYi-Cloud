package com.xueyi.system.cache.service;

/**
 * 缓存加载 业务层
 *
 * @author xueyi
 */
public interface ISysCacheInitService {

    /**
     * 加载模块-路由缓存数据
     */
    public void loadingRouteCache();

    /**
     * 加载模块缓存数据
     */
    public void loadingSystemCache();

    /**
     * 加载模块-菜单缓存数据
     */
    public void loadingSystemMenuCache();

    /**
     * 加载角色缓存数据
     * @param sourceName 数据源名称
     */
    public void loadingRoleCache(String sourceName);
}