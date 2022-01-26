package com.hdq.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hdq.common.utils.PageUtils;
import com.hdq.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author huangdaoquan
 * @email 1758398270@qq.com
 * @date 2022-01-25 17:42:40
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

