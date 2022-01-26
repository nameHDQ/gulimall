package com.hdq.gulimall.order.dao;

import com.hdq.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author huangdaoquan
 * @email 1758398270@qq.com
 * @date 2022-01-25 18:41:52
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
