package com.hdq.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hdq.common.utils.PageUtils;
import com.hdq.gulimall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author huangdaoquan
 * @email 1758398270@qq.com
 * @date 2022-01-25 17:42:40
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

