package com.xueyi.system.cache.service;

/**
 * 缓存加载 业务层
 *
 * @author xueyi
 */
public interface ISysCacheInit {

    /**
     *
     * 加载菜单缓存数据
     */
    public void loadingMenuCache();

    /**
     * 加载模块缓存数据
     */
    public void loadingSystemCache();
}