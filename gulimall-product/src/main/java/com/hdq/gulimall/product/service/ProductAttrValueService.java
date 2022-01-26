package com.hdq.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hdq.common.utils.PageUtils;
import com.hdq.gulimall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author huangdaoquan
 * @email 1758398270@qq.com
 * @date 2022-01-23 23:36:29
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

