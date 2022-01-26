package com.hdq.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hdq.common.utils.PageUtils;
import com.hdq.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author huangdaoquan
 * @email 1758398270@qq.com
 * @date 2022-01-23 23:36:29
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

