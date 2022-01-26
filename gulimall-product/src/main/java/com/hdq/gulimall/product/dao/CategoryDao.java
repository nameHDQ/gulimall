package com.hdq.gulimall.product.dao;

import com.hdq.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author huangdaoquan
 * @email 1758398270@qq.com
 * @date 2022-01-23 23:36:29
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
