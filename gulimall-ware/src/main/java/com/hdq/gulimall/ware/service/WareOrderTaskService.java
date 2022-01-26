package com.hdq.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hdq.common.utils.PageUtils;
import com.hdq.gulimall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author huangdaoquan
 * @email 1758398270@qq.com
 * @date 2022-01-25 18:55:24
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

